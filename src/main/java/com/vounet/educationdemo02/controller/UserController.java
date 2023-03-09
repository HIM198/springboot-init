package com.vounet.educationdemo02.controller;

import com.vounet.educationdemo02.common.R;
import com.vounet.educationdemo02.domain.vo.EmailVo;
import com.vounet.educationdemo02.domain.vo.UserVo;
import com.vounet.educationdemo02.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @Author HIM198
 * @Date 2023 13:09
 * @Description
 **/

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private MailService mailService;

    @PostMapping("/sendEmail")

    public String sendEmail(String email, HttpSession httpSession) {
        mailService.sendMail(email, httpSession);
        return "success";
    }

    @PostMapping("/register")

    public R register(UserVo userVo, HttpSession session) {
        R r = mailService.registered(userVo, session);
        if (r.getCode() == 0) {
            return R.success(r.getMsg());
        } else {
            return R.error(r.getMsg());
        }
    }

    @PostMapping("/login")

    public String login(String email, String password) {
        mailService.loginIn(email, password);
        return "success";
    }

    @PostMapping("rePassword")
    public R rePassword(@RequestBody EmailVo email, HttpSession session) {
        R r = mailService.rePassword(email, session);
        if (r.getCode() == 0) {
            return R.success(r.getMsg());
        } else {
            return R.error(r.getMsg());
        }
    }
}
