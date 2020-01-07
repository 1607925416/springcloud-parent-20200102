package com.aaa.yzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/4 16:50
 * @Version     : 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun8083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8083.class,args);
    }
}
