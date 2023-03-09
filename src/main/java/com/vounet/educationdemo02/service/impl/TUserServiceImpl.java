package com.vounet.educationdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vounet.educationdemo02.domain.entity.TUser;
import com.vounet.educationdemo02.service.TUserService;
import com.vounet.educationdemo02.mapper.TUserMapper;
import org.springframework.stereotype.Service;

/**
* @author HIM198
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2023-03-09 20:50:07
*/
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser>
    implements TUserService{

}




