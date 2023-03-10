package com.vounet.studentdemo01.service;

import com.vounet.studentdemo01.common.R;
import com.vounet.studentdemo01.domain.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.vounet.studentdemo01.domain.vo.StudentVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author vounet
 * @since 2023-03-03
 */
public interface StudentService extends IService<Student> {

    R StudnetLogin(StudentVo studentVo);


}
