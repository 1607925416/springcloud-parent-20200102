package com.aaa.yzq.springcloud.fallback;

import com.aaa.yzq.springcloud.model.Book;
import com.aaa.yzq.springcloud.service.SpringCloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class SpringCloudServiceFallBack implements FallbackFactory<SpringCloudService> {
    @Override
    public SpringCloudService create(Throwable throwable) {
        SpringCloudService springCloudService = new SpringCloudService() {
            @Override
            public List<Book> getAllBook() {
                List<Book> bookList = new ArrayList<>();
                Book book = new Book();
                book.setBookId(123456L);
                book.setBookName("熔断测试");
                book.setBookPrice(new BigDecimal(123456.789));
                book.setBookStatus(1);
                bookList.add(book);
                return bookList;
            }
        };
        return springCloudService;
    }
}
