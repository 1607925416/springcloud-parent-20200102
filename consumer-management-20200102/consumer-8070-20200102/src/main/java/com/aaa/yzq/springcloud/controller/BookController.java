package com.aaa.yzq.springcloud.controller;

import com.aaa.yzq.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/2 15:48
 * @Version     : 1.0
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    private static final String url="http://localhost:8080/getAllBook";
    @RequestMapping("/getAllBook")
    public List<Book> getAllBook(){
        return restTemplate.getForObject(url,List.class);
    }
}
