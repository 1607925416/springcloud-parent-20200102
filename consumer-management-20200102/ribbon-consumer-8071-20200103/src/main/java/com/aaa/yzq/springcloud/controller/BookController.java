package com.aaa.yzq.springcloud.controller;

import com.aaa.yzq.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/3 16:05
 * @Version     : 1.0
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/getAllBook")
    public List<Book> getAllBook(){
        return restTemplate.getForObject("http://BOOK-PROVIDER/getAllBook",List.class);
    }
}
