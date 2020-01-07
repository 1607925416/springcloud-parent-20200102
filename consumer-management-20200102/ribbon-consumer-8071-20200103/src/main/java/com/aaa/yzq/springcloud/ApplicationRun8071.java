package com.aaa.yzq.springcloud;

import com.aaa.yzq.springcloud.config.MyIRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/3 16:01
 * @Version     : 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name = "BOOK-PROVIDER",configuration = MyIRuleConfig.class)
public class ApplicationRun8071 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8071.class,args);
    }
}
