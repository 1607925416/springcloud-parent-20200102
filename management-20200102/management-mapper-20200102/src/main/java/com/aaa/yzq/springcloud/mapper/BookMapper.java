package com.aaa.yzq.springcloud.mapper;

import com.aaa.yzq.springcloud.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description :  
 * @Author      : cat
 * @exception   : 
 * @CreateDate  : 2020/1/2 14:33
 * @Version     : 1.0
 */
@Mapper
public interface BookMapper {
    /** 
    * 查询所有书籍 
    * @param 
    * @return java.util.List<com.aaa.yzq.springcloud.model.Book> 
    * @Author: cat
    * @Date: 2020/1/2 
    */
    List<Book> getAllBook();
}
