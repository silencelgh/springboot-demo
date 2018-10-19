package com.silence.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgh
 * @create 2018-10-19 10:41
 */
@RestController
@ResponseBody
public class HelloController {

    private  int i = 0;

    @RequestMapping("hello")
    public String hello(){
        System.out.println("hello "+i++ +"次调用");
        return "Hello";
    }
    @RequestMapping("demo")
    public String demo(){
        System.out.println("demo "+i++ +"次调用");
        return "DEMO";
    }
    @RequestMapping("liu")
    public String liu(){
        System.out.println("liu "+i++ +"次调用");
        return "LIU";
    }



}
