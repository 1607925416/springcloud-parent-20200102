package com.aaa.yzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/4 14:06
 * @Version     : 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ApplicationRun8073 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8073.class,args);
    }
}
