package com.vounet.studentdemo01.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vounet.studentdemo01.common.ErrorCode;
import com.vounet.studentdemo01.common.R;
import com.vounet.studentdemo01.domain.entity.Student;
import com.vounet.studentdemo01.domain.vo.StudentVo;
import com.vounet.studentdemo01.exception.BusinessException;
import com.vounet.studentdemo01.mapper.StudentMapper;
import com.vounet.studentdemo01.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    StudentService studentService;

    @Override
    public R StudnetLogin(StudentVo studentVo) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("studentCode", studentVo.getStudentCode());
        Student student1 = studentService.getOne(queryWrapper);

        if (student1 == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR);
//            return R.error("学生不存在");
        } else {
            if (student1.getPassword().equals(studentVo.getPassword())){
                return R.success(student1, "学生存在");
            }
            return R.error("密码错误");
        }
    }


}
