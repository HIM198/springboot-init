package com.vounet.educationdemo01.mapper;

import com.vounet.educationdemo01.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author vounet
 * @since 2023-03-03
 */

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
