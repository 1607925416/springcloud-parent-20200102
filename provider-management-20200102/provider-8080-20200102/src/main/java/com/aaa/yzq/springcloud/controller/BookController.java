package com.aaa.yzq.springcloud.controller;

import com.aaa.yzq.springcloud.model.Book;
import com.aaa.yzq.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/2 15:45
 * @Version     : 1.0
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    /**
     *
     * @author cat
     * @date 2020/1/8 15:55
     * @param :
     * @return java.util.List<com.aaa.yzq.springcloud.model.Book>
     */
    @GetMapping("/getAllBook")
    public List<Book> getAllBook(){
        List<Book> allBook = bookService.getAllBook();
        return allBook;
    }
}
