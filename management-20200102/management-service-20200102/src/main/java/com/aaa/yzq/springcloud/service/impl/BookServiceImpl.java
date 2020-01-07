package com.aaa.yzq.springcloud.service.impl;

import com.aaa.yzq.springcloud.mapper.BookMapper;
import com.aaa.yzq.springcloud.model.Book;
import com.aaa.yzq.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/2 14:42
 * @Version     : 1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> getAllBook() {
        List<Book> allBook = bookMapper.getAllBook();
        return allBook;
    }
}
