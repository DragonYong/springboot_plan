package com.geng.springbootfileupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Time: 2021-05-20 17:15
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: FileUploadController.java
 * @Program: springbootfileupload
 * @Package: com.geng.springbootfileupload.controller
 * 文件上传
 **/
@RestController
public class FileUploadController {

    @PostMapping("/fileUploadController")
    public String fileUpload(MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        // 注意file必须和html一眼个
        file.transferTo(new File("D:\\00Document\\02IdeaProjects\\springboot_workspace\\springbootfileupload\\src\\main\\resources\\static\\" + file.getOriginalFilename()));
        return "ok";
    }
}
