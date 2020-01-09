package com.aaa.yzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description:
 * @author: cat
 * @date: Created in 2020/1/9 14:23
 * @version: 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun8031 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8031.class,args);
    }
}
