package com.aaa.yzq.springcloud.controller;

import com.aaa.yzq.springcloud.model.Book;
import com.aaa.yzq.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/3 15:20
 * @Version     : 1.0
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/getAllBook")
    public List<Book> getAllBook(){
        System.out.println("222222222222222222222222222222222222222222222");
        List<Book> allBook = bookService.getAllBook();
        return allBook;
    }
}
