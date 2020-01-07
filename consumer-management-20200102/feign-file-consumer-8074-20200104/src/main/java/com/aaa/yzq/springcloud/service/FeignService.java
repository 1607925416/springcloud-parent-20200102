package com.aaa.yzq.springcloud.service;

import com.aaa.yzq.springcloud.config.FtpConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;
/**
 * @Description :  
 * @Author      : cat
 * @exception   : 
 * @CreateDate  : 2020/1/6 10:18
 * @Version     : 1.0
 */
@FeignClient(value = "FTP-PROVIDER",configuration = FtpConfig.class)
public interface FeignService {
    @PostMapping(value = "/uploadFile",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    Map<String, Object> uploadFile(@RequestPart(value = "file") MultipartFile file);
}
