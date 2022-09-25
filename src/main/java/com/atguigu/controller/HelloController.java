package com.atguigu.controller;

import com.atguigu.service.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhangchengwei
 * @create 2022-08-28 21:55
 */
@Controller
public class HelloController {

    @Autowired
    private HelloServiceImpl helloService;
}
