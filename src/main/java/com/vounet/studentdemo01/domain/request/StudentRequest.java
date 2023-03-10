package com.vounet.studentdemo01.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author HIM198
 * @Date 2023 16:31
 * @Description
 **/

@Data
public class StudentRequest implements Serializable {
    private static final long serialVersionUID = 3191241716373120793L;
    private String studentCode;
    private String password;
}
