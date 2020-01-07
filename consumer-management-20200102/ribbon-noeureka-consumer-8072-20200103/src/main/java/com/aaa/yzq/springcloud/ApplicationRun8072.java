package com.aaa.yzq.springcloud;

import com.aaa.yzq.springcloud.config.MyIRule;
import com.aaa.yzq.springcloud.config.MyIRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/3 18:54
 * @Version     : 1.0
 */
@SpringBootApplication
//@RibbonClient(name = "book-provider",configuration = MyIRuleConfig.class)
public class ApplicationRun8072 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8072.class,args);
    }
}
