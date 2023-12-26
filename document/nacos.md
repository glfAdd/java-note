##### 参考

- [ ] https://www.51cto.com/article/707408.html
- [ ] https://blog.csdn.net/love_study1314/article/details/125014123
- [ ] https://zhuanlan.zhihu.com/p/566384927
- [ ] https://blog.csdn.net/weixin_44372857/article/details/125187157
- [ ] https://spring-cloud-alibaba-group.github.io/github-pages/hoxton/zh-cn/index.html#_%E4%BE%9D%E8%B5%96%E7%AE%A1%E7%90%86 ??

[官网](https://nacos.io/zh-cn/)

[文档](https://nacos.io/zh-cn/docs/what-is-nacos.html)

[github](https://github.com/alibaba/nacos)



```bash
# 单机启动
$ sh startup.sh -m standalone

# 访问
http://localhost:8848/nacos


用户名密码默认为 nacos nacos


# 服务注册
$ curl -X POST 'http://127.0.0.1:8848/nacos/v1/ns/instance?serviceName=nacos.naming.serviceName&ip=20.18.7.10&port=8080'
# 服务发现
$ curl -X GET 'http://127.0.0.1:8848/nacos/v1/ns/instance/list?serviceName=nacos.naming.serviceName'
# 发布配置
$ curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=nacos.cfg.dataId&group=test&content=HelloWorld"
# 获取配置
$ curl -X GET "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=nacos.cfg.dataId&group=test"
```

