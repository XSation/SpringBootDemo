package com.xk.demo.controller;

import com.xk.demo.domain.User;
import com.xk.demo.domain.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@RestController
public class HelloWroldController {

    @Autowired
    private UserRespository repository;

    @RequestMapping("/hello")
    public String hello() {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        repository.save(new User("xuekai","xk3440395"));
        repository.save(new User("liuqing1","lq3440395"));
        return "HelloWrold";
    }
    @RequestMapping("/quert")
    public User hi() {
        User xuekai = repository.findByUserName("xuekai");
        return xuekai;
    }
//    @RequestMapping("/error")
//    public String error() {
//        return "HelloWrold error";
//    }
}



