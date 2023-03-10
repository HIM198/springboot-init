package com.vounet.studentdemo01.mapper;

import com.vounet.studentdemo01.domain.entity.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author HIM198
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2023-03-10 09:45:31
* @Entity com.vounet.studentdemo01.domain.entity.TUser
*/
@Mapper
public interface TUserMapper extends BaseMapper<TUser> {

}




