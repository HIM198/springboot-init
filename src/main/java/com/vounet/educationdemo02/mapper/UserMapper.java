package com.vounet.educationdemo02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vounet.educationdemo02.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author HIM198
 * @Date 2023 13:11
 * @Description
 **/

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 注册，插入数据
     * @param user
     */


    /**
     * 根据邮箱查询
     * @param email
     * @return
     */

}

