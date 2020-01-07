package com.aaa.yzq.springcloud.controller;

import com.aaa.yzq.springcloud.service.impl.FtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/4 16:28
 * @Version     : 1.0
 */
@RestController
public class FileController {
    @Autowired
    private FtpService ftpService;
    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Map<String, Object> uploadFile(@RequestPart(value = "file") MultipartFile file){
        System.out.println(file);
        Map<String, Object> upload = ftpService.upload(file);
        return upload;
    }
}
