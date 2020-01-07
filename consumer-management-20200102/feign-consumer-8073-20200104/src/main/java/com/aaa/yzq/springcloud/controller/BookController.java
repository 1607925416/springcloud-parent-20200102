package com.aaa.yzq.springcloud.controller;

import com.aaa.yzq.springcloud.model.Book;
import com.aaa.yzq.springcloud.service.SpringCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/4 14:14
 * @Version     : 1.0
 */
@RestController
public class BookController {
    @Autowired
    private SpringCloudService springCloudService;

    @RequestMapping("/getAllBook")
    public List<Book> getAllBook(){
        return springCloudService.getAllBook();
    }
}
