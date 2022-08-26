package cn.haoxiaoyong.oss.pic.manage.controller;

import cn.haoxiaoyong.oss.pic.manage.service.UploadService;
import cn.haoxiaoyong.oss.starter.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.server.PathParam;
import java.io.IOException;

/**
 * @author haoxiaoyong on 2020/3/29 下午 1:07
 * e-mail: hxyHelloWorld@163.com
 * github: https://github.com/haoxiaoyong1014
 * Blog: www.haoxiaoyong.cn
 */
@RestController
@CrossOrigin
public class UploadController {


    @Autowired
    private UploadService uploadService;

    @RequestMapping("upload")
    public String upload(MultipartFile file) {
        return uploadService.upload(file);
    }
}
