### oss-picture-manage

#### 基于 aliyun oss制作博客图床

依赖于[oss-spring-boot-project](https://github.com/haoxiaoyong1014/oss-spring-boot-project)项目

引入:
```xml
<dependency>
   <groupId>cn.haoxiaoyong.oss</groupId>
   <artifactId>oss-spring-boot-starter</artifactId>
   <version>0.0.2-beta</version>
</dependency>
```
配置oss:

```yaml
oss:
  config:
    enable: true
    endpoint: 
    access-key-secret: 
    bucket-name: 
    access-key-id: 
    dir: 
```

项目启动访问 http://localhost:8876/PicManage.html

[服务器启动脚本](https://github.com/haoxiaoyong1014/oss-picture-manage/blob/master/oss-pic.sh)

