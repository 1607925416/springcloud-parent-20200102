package com.aaa.yzq.springcloud.controller;

import com.aaa.yzq.springcloud.model.Book;
import com.aaa.yzq.springcloud.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/7 14:20
 * @Version     : 1.0
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/getAllBook")
    //@HystrixCommand(fallbackMethod = "getAllBookBack")
    public List<Book> getAllBook(){
        System.out.println(1/0);
        List<Book> allBook = bookService.getAllBook();
        return allBook;
    }

    /*public List<Book> getAllBookBack(){
        System.out.println("我发生熔断了");
        return null;
    }*/
}
