package com.aaa.yzq.springcloud.controller;

import com.aaa.yzq.springcloud.service.FeignService;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


import java.util.Map;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/4 16:41
 * @Version     : 1.0
 */
@Controller
public class FileController {
    @Autowired
    private FeignService FeginService;

    @RequestMapping("/login")
    public String toFile(){
        return "file";
    }
    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("uploadFile") MultipartFile file){

        Map<String, Object> resultMap = FeginService.uploadFile(file);
        if (!(Boolean) resultMap.get("result")) {
            // 说明上传失败！！需要跳转到错误页面
            return "error";
        } else {
            return "success";
        }
    }
}
