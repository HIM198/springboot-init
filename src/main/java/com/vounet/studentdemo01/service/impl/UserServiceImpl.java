package com.vounet.studentdemo01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vounet.studentdemo01.domain.entity.User;
import com.vounet.studentdemo01.mapper.UserMapper;
import com.vounet.studentdemo01.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author HIM198
 * @Date 2023 15:38
 * @Description
 **/

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
//    /**
//     * 获取当前登录用户
//     *
//     * @param request
//     * @return
//     */
//    @Override
//    public User getLoginUser(HttpServletRequest request) {
//        // 先判断是否已登录
//        Object userObj = request.getSession().getAttribute(USER_LOGIN_STATE);
//        User currentUser = (User) userObj;
//        if (currentUser == null || currentUser.getId() == null) {
//            throw new BusinessException(ErrorCode.NOT_LOGIN_ERROR);
//        }
//        // 从数据库查询（追求性能的话可以注释，直接走缓存）
//        long userId = currentUser.getId();
//        currentUser = this.getById(userId);
//        if (currentUser == null) {
//            throw new BusinessException(ErrorCode.NOT_LOGIN_ERROR);
//        }
//        return currentUser;
//    }
}
