package com.aaa.yzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/2 16:09
 * @Version     : 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun8060 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8060.class,args);
    }
}
