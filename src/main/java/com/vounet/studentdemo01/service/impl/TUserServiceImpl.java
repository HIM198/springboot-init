package com.vounet.studentdemo01.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vounet.studentdemo01.common.R;
import com.vounet.studentdemo01.domain.entity.TUser;
import com.vounet.studentdemo01.service.TUserService;
import com.vounet.studentdemo01.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author HIM198
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2023-03-10 09:45:31
*/
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser>
    implements TUserService {

    @Autowired
    TUserMapper tUserMapper;
    @Override
    public R delTUserById(Long id) {
        QueryWrapper<TUser> qUeryWrapper = new QueryWrapper<>();
        qUeryWrapper.eq("id", id);
        TUser tUser = this.getOne(qUeryWrapper);
        if (tUser == null) {
            return R.error("用户不存在");
        } else {
            this.removeById(id);

            return R.success("删除成功");
        }
    }
}






