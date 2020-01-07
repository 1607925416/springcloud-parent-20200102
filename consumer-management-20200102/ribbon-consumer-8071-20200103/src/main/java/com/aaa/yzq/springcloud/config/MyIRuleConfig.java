package com.aaa.yzq.springcloud.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/3 17:05
 * @Version     : 1.0
 */
@Configuration
public class MyIRuleConfig {
    @Bean
    public IRule getMyIRule(){
        return new MyIRule();
    }
}
