package com.vounet.springbootInit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.vounet.springbootInit"})

public class EducationDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(EducationDemo01Application.class, args);
    }

}
