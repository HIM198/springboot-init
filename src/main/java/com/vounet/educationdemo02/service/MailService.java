package com.vounet.educationdemo02.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vounet.educationdemo02.common.R;
import com.vounet.educationdemo02.domain.entity.User;
import com.vounet.educationdemo02.domain.vo.EmailVo;
import com.vounet.educationdemo02.domain.vo.UserVo;
import com.vounet.educationdemo02.mapper.UserMapper;
import com.vounet.educationdemo02.domain.vo.UserVoToUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * @Author HIM198
 * @Date 2023 13:17
 * @Description
 **/

@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;//一定要用@Autowired

    @Autowired
    private UserMapper userMapper;//注入UserMapper，交给bena

    //application.properties中已配置的值
    @Value("${spring.mail.username}")
    private String from;
    private static final String EMAIL= "email";

    /**
     * 给前端输入的邮箱，发送验证码
     *
     * @param email
     * @param session
     * @return
     */
    public boolean sendMail(String email, HttpSession session) {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            //生成随机数
            String code = randomCode();//自定义函数

            mailMessage.setSubject("来说后端的验证码邮件");//主题
            mailMessage.setText("您收到的验证码是：" + code);//内容

            mailMessage.setTo(email);//发给谁

            mailMessage.setFrom(from);//你自己的邮箱

            mailSender.send(mailMessage);//发送

            //将随机数放置到session中
            session.setAttribute(EMAIL, email);
            session.setAttribute("code", code);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 随机生成6位数的验证码
     *
     * @return String code
     */
    public String randomCode() {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }

    /**
     * 检验验证码是否一致
     *
     * @param userVo
     * @param session
     * @return
     */
    public R registered(UserVo userVo, HttpSession session) {
        //获取session中的验证信息
        String email = (String) session.getAttribute(EMAIL);
        String code = (String) session.getAttribute("code");

        //获取表单中的提交的验证信息
        String voCode = userVo.getCode();

        //如果email数据为空，或者不一致，注册失败
        if (email == null || email.isEmpty()) {
            //return "error,请重新注册";
            return R.error("email数据为空,请重新注册");
        } else if (!code.equals(voCode)) {
            //return "error,请重新注册";
            return R.error("验证码错误");
        }

        //保存数据
        User user = UserVoToUser.toUser(userVo);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", user.getUsername());
        User user1 = userMapper.selectOne(queryWrapper);
        if (user1 != null) {
            return R.error("用户名已经被注册");
        }
        //将数据写入数据库
        Integer num = userMapper.insert(user);
        if (num == 0)
            return R.error("注册未成功");

        //跳转成功页面
        return R.success(user, "欢迎" + user.getUsername());
    }

    /**
     * 通过输入email查询password，然后比较两个password，如果一样，登录成功
     *
     * @param email
     * @param password
     * @return
     */

    public boolean loginIn(String email, String password) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(EMAIL, email);
        User user = userMapper.selectOne(queryWrapper);

        if (!user.getPassword().equals(password)) {
            return false;
        }
        System.out.println("登录成功:数据库密码是：" + user.getPassword());
        return true;
    }

    public R rePassword(EmailVo emailVo, HttpSession session) {
        String code = session.getAttribute("code").toString();

        String voCode = emailVo.getCode();

        if (!code.equals(voCode)) {
            //return "error,请重新注册";
            return R.error("验证码错误");
        } else {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("email", emailVo.getEmail());
            User user = userMapper.selectOne(queryWrapper);
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            mailMessage.setSubject("来说后端的验证码邮件");//主题
            mailMessage.setText("您的密码是:" + user.getPassword());
            mailMessage.setTo(emailVo.getEmail());//发给谁
            mailMessage.setFrom(from);//你自己的邮箱
            mailSender.send(mailMessage);//发送

            return R.success("密码已经发送到您的邮箱");

        }
    }
}



