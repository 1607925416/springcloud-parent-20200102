package com.aaa.yzq.springcloud.service;

import com.aaa.yzq.springcloud.model.Book;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/2 14:41
 * @Version     : 1.0
 */
public interface BookService {
    /**
    * 查询说有书籍
    * @param
    * @return java.util.List<com.aaa.yzq.springcloud.model.Book>
    * @Author: cat
    * @Date: 2020/1/2
    */
    List<Book> getAllBook();
}
