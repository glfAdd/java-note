### 插件

##### SequenceDiagram

序图和类图

```
https://juejin.cn/post/7134877521182457869
https://blog.csdn.net/qq_35030548/article/details/132092597


系统自带的
https://www.cnblogs.com/aaaazzzz/p/14018313.html
https://blog.csdn.net/weixin_45393094/article/details/126795316 (详细)
```

##### PlantUML Integration

思维导图

```
https://juejin.cn/post/7017988314053492767
https://cloud.tencent.com/developer/article/1798803
https://blog.csdn.net/youanyyou/article/details/113988539
```

##### Alibaba Java Coding Guidelines

```
阿里代码规约检测
```

##### 

```
RestfulToolKit 一套 RESTful 服务开发辅助工具集，完美代替postman
https://github.com/huangbaihua001/RestfulToolkitX/blob/main/README_zh_CN.md

RESTFul-Tool


Restful Api Tool https://plugins.jetbrains.com/plugin/22446-restful-api-tool
RESTFul-Tool https://plugins.jetbrains.com/plugin/14280-restful-tool



GsonFormat json 转对象
 
 



VisualGC 
Java Stream Debugger (不更新了, 装不上)
JOL Java Object Layout 分析jvm中内存对象布局方案的工具

Stack trace to UML
Stack trace to UML 支持根据 JVM 异常堆栈画 UML时序图和通信图。
打开方式 Analyze > Open Stack trace to UML plugin + Generate UML diagrams from stacktrace from debug
```

##### Mybatis log

https://plugins.jetbrains.com/plugin/13905-mybatis-log/versions

日志工具

##### Statistic

代码量统计

##### Grep Console

https://blog.csdn.net/weixin_43343127/article/details/133749375

终端日志 grep

<img src="./image/终端日志过滤.png" alt="终端日志过滤" style="zoom:80%;"/>

##### CodeGlance

代码缩略图

##### Maven Helper

查看 maven 依赖

<img src="./image/Maven Helper 使用1.png" alt="Maven Helper 使用1" style="zoom:80%;" />

```
Conflicts（查看冲突）
All Dependencies as List（列表形式查看所有依赖）
All Dependencies as Tree（树形式查看所有依赖）


找到要处理的冲突选择 "Exclude", 插件自动会在 pom.xml 文件中添加 <exclusion> 相关代码
```

##### JRebel and XRebel (IDEA 插件)

> JRebel: Java 代码修改后不用重启系统，热部署.
>
> XRebel: API 分析
>
> [文档](https://manuals.jrebel.com/xrebel/#configuration)

###### 激活

- JRebel 激活方式 (直接使用别人搭建好的激活服务器)

  ```
  1. Team URL 从 https://jrebel.speedcow.top/ 这里获取
  	Activation address: https://jrebel.speedcow.top/27e79612-b62c-687a-d3fd-6c885532286f
  2. 邮箱随便填写
  ```

- JRebel 激活方式 (运行 jar 服务)

  ```
  1. 下载地址 https://gitee.com/dssss/resource-library/blob/master/JrebelBrainsLicenseServerforJava/JrebelBrainsLicenseServerforJava-1.0-SNAPSHOT-jar-with-dependencies.jar
  
  2. 启动 jar
  java -jar JrebelBrainsLicenseServerforJava-1.0-SNAPSHOT-jar-with-dependencies.jar
  
  3. web 地址
  http://localhost:8081/
  
  
  随机生成 GUID
  https://www.guidgen.com/
  
  
  例如
  http://localhost:8081/ebe878f4-19da-4c5d-aa1f-49922f3ee692
  ```

- XRebel 激活同 JRebel

###### IDEA 设置

https://cloud.tencent.com/developer/article/2222426

1. 打开 IDEA 自动编译

   <img src="./image/打开自动构建.png" alt="打开自动构建" style="zoom:80%;" />

2. 打开自动 make

   Windows 系统 `Ctrl + Shift + Alt + /` 选择 `Registry`, Mac 系统 `shift + option + command + /` 勾选 `compiler.automake.allow.when.app.running`, 或者使用页面操作

   <img src="./image/打开自动make.png" alt="打开自动make" style="zoom:80%;" />

###### 使用

XRebel web 地址 http://localhost:48085/xrebel

<img src="./image/XRebel 页面.png" alt="XRebel 页面" style="zoom:80%;" />

```
能够捕捉到应用运行时发生的异常
能够详细的观察某每一次的调用，而且能够非常详细的观察各个步骤的执行时间
每个步骤还可以看到详细的源码执行流程
在数据库操作上能够看到具体的耗时和格式化后的SQL语句
可以查看详细的系统执行日志，可以下载到本地
不仅支持单机模式下，还可以应用于微服务分布式
```

###### 问题 1

web 页面提示如下信息

<img src="./image/XRebel 问题1.png" alt="XRebel 问题1" style="zoom:100%;" />

```

```



##### XRebel (第三方安装)

[下载地址](https://www.jrebel.com/products/xrebel/download)

```
在启动前则需要配置 VM options: -javaagent:[/path/to/]xrebel.jar 启动参数
```









