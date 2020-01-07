package com.aaa.yzq.springcloud.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/2 14:25
 * @Version     : 1.0
 */
@Data
public class Book implements Serializable {
    /**
     * 图书id
     */
    private Long bookId;

    /**
     * 图书名称
     */
    private String bookName;

    /**
     * 图书价格
     */
    private BigDecimal bookPrice;

    /**
     * 图书状态1可用0不可用
     */
    private Integer bookStatus;
}
