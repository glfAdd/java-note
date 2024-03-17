### 错误

##### 启动错误 1

```
报错信息:
Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.


解决办法:
application.yaml 添加
debug: true
```

```

application.properties

application.yaml


```





##### SLF4J - 1

spring cloud 启动报错

```
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
```

办法: pom 添加依赖

```
<!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-simple -->
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-simple</artifactId>
    <version>2.0.9</version>
    <scope>test</scope>
</dependency>
```







