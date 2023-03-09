package com.vounet.educationdemo02.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vounet.educationdemo02.common.ErrorCode;
import com.vounet.educationdemo02.common.R;
import com.vounet.educationdemo02.domain.entity.Student;
import com.vounet.educationdemo02.domain.vo.StudentVo;
import com.vounet.educationdemo02.exception.BusinessException;
import com.vounet.educationdemo02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author vounet
 * @since 2023-03-03
 */
@RestController
@RequestMapping("//student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/demo")
    public String demo() {
        System.out.println("123");
        return "demo00";
    }

    @PostMapping("/login")
    public R login(@RequestBody StudentVo studentVo) {
        return studentService.StudnetLogin(studentVo);
    }


    @PostMapping("/register")
    public R register(@RequestBody Student student)  {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("studentCode", student.getStudentCode());
        Student student1 = studentService.getOne(queryWrapper);

        if (student1 == null) {
            studentService.save(student);
            return R.success("注册成功");
        } else {
            return R.error("学生已存在");
        }
    }



}
