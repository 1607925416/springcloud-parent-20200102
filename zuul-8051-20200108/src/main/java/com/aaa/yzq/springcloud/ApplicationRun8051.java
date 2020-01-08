package com.aaa.yzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description:
 * @author: cat
 * @date: Created in 2020/1/8 15:17
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApplicationRun8051 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8051.class,args);
    }
}
