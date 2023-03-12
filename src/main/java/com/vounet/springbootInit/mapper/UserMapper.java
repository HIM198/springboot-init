package com.vounet.springbootInit.mapper;

import com.vounet.springbootInit.domain.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author HIM198
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2023-03-12 18:20:58
* @Entity com.vounet.springbootInit.domain.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




