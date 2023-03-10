package com.vounet.studentdemo01.service;

import com.vounet.studentdemo01.common.R;
import com.vounet.studentdemo01.domain.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author HIM198
* @description 针对表【t_user】的数据库操作Service
* @createDate 2023-03-10 09:45:31
*/
public interface TUserService extends IService<TUser> {

    R delTUserById(Long id);

}
