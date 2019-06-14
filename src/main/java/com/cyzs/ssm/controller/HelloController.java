package com.cyzs.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaoH
 * @create 2019-06-13-1:28
 */
@Controller
public class HelloController {

    @RequestMapping(value="/hello")
    public String hello(){
        return "success";
    }
}
