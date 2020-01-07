package com.aaa.yzq.springcloud.service;

import com.aaa.yzq.springcloud.fallback.SpringCloudServiceFallBack;
import com.aaa.yzq.springcloud.model.Book;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/4 14:11
 * @Version     : 1.0
 */
@FeignClient(value = "BOOK-PROVIDER",fallbackFactory = SpringCloudServiceFallBack.class)
public interface SpringCloudService {


    /**
    * feign的接口
    * @param
    * @return java.util.List<com.aaa.yzq.springcloud.model.Book>
    * @Author: cat
    * @Date: 2020/1/4
    */
    @GetMapping("/getAllBook")
    List<Book> getAllBook();
}
