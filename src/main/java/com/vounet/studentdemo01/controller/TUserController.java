package com.vounet.studentdemo01.controller;

import com.vounet.studentdemo01.common.R;
import com.vounet.studentdemo01.domain.entity.TUser;
import com.vounet.studentdemo01.service.TUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author HIM198
 * @Date 2023 10:25
 * @Description
 **/

@RestController
@Slf4j
@RequestMapping("/tUser")
public class TUserController {

    @Autowired
    TUserService tUserService;
    @PostMapping("/delTUser")
    public R delTUser(Long id) {
        return tUserService.delTUserById(id);
    }
}
