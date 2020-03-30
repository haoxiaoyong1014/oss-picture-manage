package cn.haoxiaoyong.oss.pic.manage.service;

import cn.haoxiaoyong.oss.starter.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author haoxiaoyong on 2020/3/29 下午 1:49
 * e-mail: hxyHelloWorld@163.com
 * github: https://github.com/haoxiaoyong1014
 * Blog: www.haoxiaoyong.cn
 */
@Service
public class UploadService {

    @Autowired
    private OssService ossService;

    @Value("${oss.config.dir}")
    private String fileDir;

    public String upload(MultipartFile file) {
        String url = "fail";
        String fileName = fileDir + file.getOriginalFilename();
        try {
            if (!ossService.exist(fileName)) {
                url = ossService.upload(fileName, file.getInputStream());
                if (!StringUtils.isEmpty(url)) {
                    return url;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return url;
    }
}
