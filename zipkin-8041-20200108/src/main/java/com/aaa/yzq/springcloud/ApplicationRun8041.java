package com.aaa.yzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @description:
 * @author: cat
 * @date: Created in 2020/1/8 16:43
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ApplicationRun8041 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8041.class,args);
    }
}
