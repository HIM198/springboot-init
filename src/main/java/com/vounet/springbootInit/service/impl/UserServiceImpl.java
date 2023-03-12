package com.vounet.springbootInit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vounet.springbootInit.domain.entity.User;
import com.vounet.springbootInit.service.UserService;
import com.vounet.springbootInit.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author HIM198
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2023-03-12 18:20:58
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




