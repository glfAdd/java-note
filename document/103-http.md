

```


RestTemplate 是传统的同步 HTTP 客户端，支持负载均衡，适用于简单场景。
WebClient 是一个非阻塞的异步 HTTP 客户端，适用于响应式编程。
Feign 提供声明式的 HTTP 客户端，简化了请求的写法，适合服务间调用。

```

##### RestTemplate

````
````

##### WebClient

```


```

# Feign

```
首先通过@EnableFeignCleints注解开启FeignCleint



```

##### FeignClient 工作原理

```
Feign的源码实现的过程如下:
1. 首先通过 @EnableFeignCleints 注解开启 FeignCleint
2. 根据 Feign 的规则实现接口, 并加 @FeignCleint 注解
3. 程序启动后，会进行包扫描所有 @FeignCleint 的注解的类, 并将这些信息注入到 ioc 容器中
4. 当接口的方法被调用, 通过 jdk 的代理来生成具体的 RequesTemplate
5. RequesTemplate 生成 Request
6. Request 交给 Client 去处理，其中Client可以是HttpUrlConnection、HttpClient也可以是Okhttp
7. 最后 Client 被封装到 LoadBalanceClient 类，这个类结合类Ribbon做到了负载均衡
```

##### 问题 1

```
2024-11-15 16:24:41 WARN  AnnotationConfigServletWebServerApplicationContext - Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'userInfoController': Injection of resource dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'com.glf.client.UserClient': Unexpected exception during bean creation; nested exception is java.lang.IllegalStateException: No Feign Client for loadBalancing defined. Did you forget to include spring-cloud-starter-loadbalancer?



```

