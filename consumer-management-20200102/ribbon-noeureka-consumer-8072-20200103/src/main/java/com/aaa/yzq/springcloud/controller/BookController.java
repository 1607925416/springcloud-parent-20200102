package com.aaa.yzq.springcloud.controller;

import com.aaa.yzq.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/3 18:56
 * @Version     : 1.0
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @RequestMapping("/getAllBook")
    public List<Book> getAllBook(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("book-provider");

        return restTemplate.getForObject("http://book-provider/getAllBook" , List.class);
    }
}
