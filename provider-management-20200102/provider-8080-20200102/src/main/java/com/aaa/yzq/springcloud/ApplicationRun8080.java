package com.aaa.yzq.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/2 14:47
 * @Version     : 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun8080 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8080.class,args);
    }
}
