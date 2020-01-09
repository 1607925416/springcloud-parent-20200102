package com.aaa.yzq.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: cat
 * @date: Created in 2020/1/9 15:32
 * @version: 1.0
 */
@RestController
public class TestController {
        @Value("${server.port}")
        private String port;
        @Value("${spring.application.name}")
        private String name;
        @RequestMapping("/test")
        public String test(){
            return port+""+name;
        }
}
