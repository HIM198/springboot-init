package com.vounet.educationdemo01.service.impl;

import com.vounet.educationdemo01.entity.Student;
import com.vounet.educationdemo01.mapper.StudentMapper;
import com.vounet.educationdemo01.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author vounet
 * @since 2023-03-03
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
