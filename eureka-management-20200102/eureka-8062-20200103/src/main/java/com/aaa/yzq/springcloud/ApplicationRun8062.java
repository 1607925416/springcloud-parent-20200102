package com.aaa.yzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/3 14:28
 * @Version     : 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun8062 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8062.class,args);
    }
}
