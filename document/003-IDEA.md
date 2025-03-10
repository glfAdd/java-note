[TOC]

# 设置

```
-Xms512m 设置初时的内存大小，提高Java程序的启动速度
-Xmx750m 设置最大内存数，提高该值，可以减少内存Garage收集的频率，提高程序性能。
-Xverify：none 关闭Java字节码验证，从而加快了类装入的速度，并使得在仅为验证目的 而启动的过程中无需装入类，缩短了启动时间
-XX:+UseParNewGC 使用并行收集算法
-server 控制内存garage方式，这样你无需在花一到两分钟等待内存garage的收集
-Dsun.awt.keepWorkingSetOnMinimize=true 可以让IDEA最小化到任务栏时依然保持以占有的内存，当你重新回到IDEA，能够被快速显示，而不是由灰白的界面逐渐显现整个界面，加快回复到原界面的速度。
关键参数：

-XX:ReservedCodeCacheSize 保留代码占用的内存容量参数
```

##### 编译速度慢

```
buidl 速度慢, 修改
Shared build process heap size (Mbytes):
```

##### 更换启动图片

```
lib 文件夹下面打开 app.jar 文件, 替换 idea_logo.png 和 idea_logo@2x.png 
```

##### 关闭代码自动折叠

![idea关闭默认代码折叠](./image/idea关闭默认代码折叠.png)

##### debug 时直接返回

```
https://blog.csdn.net/qq_35472880/article/details/102911213

https://blog.csdn.net/qq_34033853/article/details/123710220
```

##### 文件树

<img src="./image/Project视图中的时间以及文件大小.png" alt="Project视图中的时间以及文件大小" style="zoom:80%;" />

##### 结束进程

<img src="./image/idea debug立即结束进程.png" alt="idea debug立即结束进程" style="zoom:40%;" />

##### 编译

<img src="./image/idea编译设置.png" alt="idea编译设置" style="zoom:80%;" />

##### 编译内存

<img src="./image/idea编译内存.png" alt="idea编译内存" style="zoom:40%;" />

##### 预览折叠

<img src="./image/代码自动缩进.png" alt="代码自动缩进" style="zoom:90%;" />

<img src="./image/代码自动缩进2.png" alt="代码自动缩进" style="zoom:90%;" />

##### 标签多了换行

<img src="./image/idea标签多了换行.png" alt="idea标签多了换行" style="zoom:80%;" />

##### 代码提示忽略大小写

<img src="./image/idea代码提示忽略大小写.png" alt="idea代码提示忽略大小写" style="zoom:90%;" />

##### 注释设置

<img src="./image/idea注释设置1.png" alt="idea注释设置" style="zoom:80%;" />

<img src="./image/idea注释设置2.png" alt="idea注释设置2" style="zoom:100%;" />

##### 主题

```

```

# 快捷键

```
Command + shift + F12				代码窗口最大化
Command + E									最近打开文件
Ctrl + Shift + F4						关闭当前小窗口
Command + F12								浮动窗口显示方法
Command + F9								手动构建(Build Project)
```

# 插件

##### 插件安装位置

```
Windows：%USERPROFILE%\.IntelliJIdea<version>\config\plugins
macOS：~/Library/Application Support/JetBrains/IntelliJIdea<version>/plugins
Linux：~/.config/JetBrains/IntelliJIdea<version>/plugins
```

##### 插件主页

https://plugins.jetbrains.com/

##### sonarqube for ide

> https://plugins.jetbrains.com/plugin/7973-sonarqube-for-ide
>
> 代码质量检测工具

```

```



##### QuickTab

> https://plugins.jetbrains.com/plugin/22849-quicktab
>
> 在小窗口快速算选择标签
>
> Press alt + a to start the plugin

<img src="./image/插件-窗口选择标签.png" alt="插件-窗口选择标签" style="zoom:100%;" />

##### Easy-tabs

> https://plugins.jetbrains.com/plugin/22047-easy-tabs
>
> 标签显示编号

<img src="./image/插件-标签选择显示编号.png" alt="插件-标签选择显示编号" style="zoom:100%;" />

##### SequenceDiagram Core

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

##### Apipost-Helper-2.0

```
弃用
  RestfulToolkitX (功能太简单) 52.2k
  RESTFul-Tool (功能简单) 445.8k
  Fast Request – API Buddy (付费的) 218.7k
  Cool Request (人少) 16.8k 
  Restful Api Tool (暂时不用) 6k
```

<img src="./image/apifox令牌设置.png" alt="apifox令牌设置" style="zoom:80%;" />

##### Stack trace to UML

```
Stack trace to UML 支持根据 JVM 异常堆栈画 UML时序图和通信图。
打开方式 Analyze > Open Stack trace to UML plugin + Generate UML diagrams from stacktrace from debug
```

##### JDK VisualGC

> https://plugins.jetbrains.com/plugin/14557-jdk-visualgc
>
> 实时可视化Hotspot JVM垃圾回收监控工具，支持查看本地和远程JVM进程，支持G1和ZGC算法

```





```

##### JOL Java Object Layout

分析 jvm 中内存对象布局方案的工具

##### GsonFormat

 json 转对象

##### MybatisX

> https://plugins.jetbrains.com/plugin/10119-mybatisx
>
>  mapper 和 xml 跳转

##### Mybatis log Free

> https://plugins.jetbrains.com/plugin/17898-mybatis-log-free
>
>  日志工具

##### Statistic

代码量统计

##### Grep Console

https://blog.csdn.net/weixin_43343127/article/details/133749375

终端日志 grep

<img src="/Users/glfadd/Downloads/source/java-note/document/image/终端日志过滤.png" alt="终端日志过滤" style="zoom:80%;"/>

##### CodeGlance

代码缩略图

##### Maven Helper

查看 maven 依赖

<img src="/Users/glfadd/Downloads/source/java-note/document/image/Maven Helper 使用1.png" alt="Maven Helper 使用1" style="zoom:80%;" />

```
Conflicts（查看冲突）
All Dependencies as List（列表形式查看所有依赖）
All Dependencies as Tree（树形式查看所有依赖）


找到要处理的冲突选择 "Exclude", 插件自动会在 pom.xml 文件中添加 <exclusion> 相关代码
```

##### JRebel and XRebel (IDEA 插件)

> https://plugins.jetbrains.com/plugin/4441-jrebel-and-xrebel/versions/stable
>
> JRebel: Java 代码修改后不用重启系统，热部署.
>
> XRebel: API 分析
>
> [文档](https://manuals.jrebel.com/xrebel/#configuration)
>
> 高版本激活失败, 使用低版本 jr-ide-intellij-2024.2.1, 激活之后使用高版本

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
  $ wget https://gitee.com/dssss/resource-library/raw/master/JrebelBrainsLicenseServerforJava/JrebelBrainsLicenseServerforJava-1.0-SNAPSHOT-jar-with-dependencies.jar
  
  2. 启动 jar
  java -jar JrebelBrainsLicenseServerforJava-1.0-SNAPSHOT-jar-with-dependencies.jar
  
  3. web 地址
  http://localhost:8081/
  
  
  随机生成 GUID
  https://www.guidgen.com/
  
  
  例如
  http://localhost:8081/849ee001-bdd3-4c22-9593-3387a775935d
  ```

- XRebel 激活同 JRebel

###### IDEA 设置

https://cloud.tencent.com/developer/article/2222426

1. 打开 IDEA 自动编译

   <img src="/Users/glfadd/Downloads/source/java-note/document/image/打开自动构建.png" alt="打开自动构建" style="zoom:80%;" />

2. 打开自动 make

   Windows 系统 `Ctrl + Shift + Alt + /` 选择 `Registry`, Mac 系统 `shift + option + command + /` 勾选 `compiler.automake.allow.when.app.running`, 或者使用页面操作

   <img src="/Users/glfadd/Downloads/source/java-note/document/image/打开自动make.png" alt="打开自动make" style="zoom:80%;" />

###### 问题 2

JRebel debug 无法启动

<img src="./image/JRebel debug 无法启动.png" alt="JRebel debug 无法启动" style="zoom:80%;" />

###### 快捷键

```
Ctrl + Shift + F9					编译
Command + F9



```



##### XRebel (第三方安装)

>  如果 IDEA 安装了插件就不用再次安装, 不使用 IDEA 插件, 在其他地方运行的时候使用这种方式 
>
>  不使用插件的时候
>
>  [下载地址](https://www.jrebel.com/products/xrebel/download)

```
1. 下载


2. 在 "编辑配置" -> "虚拟机参数" 增加参数
-javaagent:[/path/to/]xrebel.jar
-javaagent:/Users/glfadd/opt/xrebel/xrebel.jar
```

###### 使用

XRebel web 地址 项目根 url 后面输入/xrebel

http://localhost:8080/xrebel

<img src="/Users/glfadd/Downloads/source/java-note/document/image/XRebel 页面.png" alt="XRebel 页面" style="zoom:80%;" />

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

<img src="/Users/glfadd/Downloads/source/java-note/document/image/XRebel 问题1.png" alt="XRebel 问题1" style="zoom:100%;" />

###### 问题 2

```
问题描述:
XRebel 启动速度慢


解决办法:
从 "编辑配置" 里面 debug, XRebel 启动速度快
```

###### 问题 3

```
2024-11-14 16:15:19.222 XRebel: WARNING 
2024-11-14 16:15:19.222 XRebel: WARNING You have multiple '/Users/glfadd/Library/Application Support/JetBrains/IntelliJIdea2024.1/plugins/jr-ide-idea/lib/xrebel/xrebel.jar's as -javaagent in your server startup script
2024-11-14 16:15:19.222 XRebel: WARNING 
```



##### SonarLine

>  空指针检测

```

```

##### Jump to Line

>  https://plugins.jetbrains.com/plugin/14877-jump-to-line
>
> 代码跳转

```
```

##### Key Promoter X

> https://plugins.jetbrains.com/plugin/9792-key-promoter-x
>
>  展示快捷键

##### Doc-Aware Search Everywhere

> 帮助文档扩展
>
> https://plugins.jetbrains.com/plugin/14308-doc-aware-search-everywhere

##### Rainbow brackets

> 彩虹括号
>
> https://plugins.jetbrains.com/plugin/10080-rainbow-brackets

##### Atom Material Icons

> 文件图标
>
> https://plugins.jetbrains.com/plugin/10044-atom-material-icons

##### Translation

> 翻译
>
> https://plugins.jetbrains.com/plugin/8579-translation

##### Alibaba Java Coding Guidelines (XenoAmess TPM)

> 阿里代码规范插件
>
> https://plugins.jetbrains.com/plugin/14109-alibaba-java-coding-guidelines-xenoamess-tpm-

<img src="./image/阿里代码扫描.png" alt="阿里代码扫描" style="zoom:80%;" />

##### .env files support

> 环境变量文件提示
>
> https://plugins.jetbrains.com/plugin/9525--env-files-support

##### Restful Tool

> restful 插件
>
> https://plugins.jetbrains.com/plugin/14280-restful-tool

##### String Manipulation

> https://plugins.jetbrains.com/plugin/2162-string-manipulation
>
> 字符串处理
>
> https://blog.csdn.net/PUYALEI/article/details/134150287

##### Mend Advise

> https://plugins.jetbrains.com/plugin/13805-mend-advise
>
> CVE 插件

```
https://checkmarx.com/
```

##### TreeInfotip

> https://plugins.jetbrains.com/plugin/12994-treeinfotip
>
> 代码添加水印描述

<img src="./image/TreeInfotip插件.gif" alt="TreeInfotip插件" style="zoom:100%;" />

##### AceJump

> https://plugins.jetbrains.com/plugin/7086-acejump
>
> 根据字体跳转

```
按两次
Ctrl + ;
或
Command + ;
```

##### Database Navigator

> https://plugins.jetbrains.com/plugin/1800-database-navigator
>
> 数据库 navicate

```

```

##### 

```

```

##### 

```

```

##### 

```

```



### maven 漏洞扫描

##### owasp dependency-check

[官网](https://owasp.org/www-project-dependency-check/)

```
https://www.cnblogs.com/chopper-poet/p/14446297.html
https://www.cnblogs.com/happylumei/p/16091297.html

https://github.com/jeremylong/DependencyCheck
https://zhuanlan.zhihu.com/p/256184896
https://www.cnblogs.com/linyb-geek/p/16106789.html
```

### 待验证插件

```
JPA Buddy
https://plugins.jetbrains.com/plugin/15075-jpa-buddy


Codota


CodeGeeX
智能助手插件


GsonFormatPlus JSON
将JSON数据转变为Java实体数据
```

### 弃用插件

##### JFrog

> https://plugins.jetbrains.com/plugin/9834-jfrog

```
https://www.jfrogchina.com
https://jfrog.com/start-free/
```

##### MurphySec Code Scan

> https://plugins.jetbrains.com/plugin/18274-murphysec-code-scan

```
https://www.murphysec.com/docs/faqs/integration/jetbrains-ide-plugin.html
https://www.murphysec.com/
```

##### Synopsys Code Sight

> https://plugins.jetbrains.com/plugin/11516-synopsys-code-sight
>
> CVE 插件

##### maven dependency checker

> https://plugins.jetbrains.com/plugin/18525-maven-dependency-checker

##### maven dependency updater

> https://plugins.jetbrains.com/plugin/11261-maven-dependency-updater

##### Momo Code Sec Inspector (Java)

> https://plugins.jetbrains.com/plugin/15120-momo-code-sec-inspector-java-

##### google java format

###### idea 插件

> https://plugins.jetbrains.com/plugin/8527-google-java-format
>
> java 代码格式化

<img src="./image/google java format插件.png" alt="google java format插件" style="zoom:80%;" />

IDEA 设置虚拟机参数 `Help→Edit Custom VM Options...`

```
--add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED
--add-exports=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED
--add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED
--add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED
--add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED
--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED
```

###### jar 包

- 方式1: 手动下载

  [github](https://github.com/google/google-java-format) 下载 google-java-format-1.24.0-all-deps.jar 包

- 方式2: 软件源安装

  ```bash
  $ brew install google-java-format
  ```

  

```
java -jar google-java-format-1.15.0-all-deps.jar <options> [files...]
Usage: google-java-format [options] file(s)
```

##### checkstyle idea

> https://plugins.jetbrains.com/plugin/1065-checkstyle-idea
>
> [github](https://github.com/checkstyle/checkstyle)
>
> [checkstyle 模板下载地址](https://github.com/checkstyle/checkstyle/tree/master/src/main/resources)
>
> 代码格式化

<img src="./image/checkstyle idea插件.png" alt="checkstyle idea插件" style="zoom:80%;" />



1. 创建一个 checkstyle.xml 文件

```xml
<module name="Checker">
    <module name="TreeWalker">
        <module name="LineLength">
            <property name="max" value="100"/> <!-- 设置每行最大长度为100 -->
            <property name="ignorePattern" value="^\\s*$"/> <!-- 忽略空行 -->
        </module>
    </module>
</module>
```

2. Checkstyle 导入 checkstyle.xml 文件



```bash
导出配置

$ java -cp checkstyle-<version>.jar com.puppycrawl.tools.checkstyle.Main -c /path/to/checkstyle.xml -f xml /path/to/your/java/files > report.xml



```

### VisualVM

教程

https://github.com/moxi624/LearningNotes/blob/master/Java/VisualVM%E5%AE%89%E8%A3%85VisualGC%E6%8F%92%E4%BB%B6/README.md

https://visualvm.github.io/pluginscenters.html









[下载地址](https://visualvm.github.io/download.html)

###### 

```
https://github.com/moxi624/LearningNotes/blob/master/Java/VisualVM%E5%AE%89%E8%A3%85VisualGC%E6%8F%92%E4%BB%B6/README.md
```

###### 

```




```

# debug

##### 快捷键





# java 项目

```
创建项目


创建模块

```

##### Archetype

[maven arch type 说明](https://maven.apache.org/archetype/index.html)

```
maven-archetype-archetype			生成示例原型项目的原型
maven-archetype-j2ee-simple		一种原型，用于生成简化的示例J2EE应用程序
maven-archetype-mojo					用于生成示例Maven插件示例的原型
maven-archetype-plugin				生成示例Maven插件的原型
maven-archetype-plugin-site		生成示例Maven插件站点的原型
maven-archetype-portlet				生成样本JSR-268 Portlet的原型
maven-archetype-quickstart		生成示例Maven项目的原型
maven-archetype-simple				生成简单Maven项目的原型
maven-archetype-site					生成示例Maven站点，该站点演示了一些受支持的文档类型，例如APT，XDoc和FML，并演示了如何构建您的站点
maven-archetype-site-simple		用于生成示例Maven站点的原型
maven-archetype-webapp				用于生成示例Maven Webapp项目的原型
```

##### 

```
$ mvn archetype:generate

Maven 插件允许我们从已有项目生成一个模板项目。在项目根目录下执行mvn archetype:create-from-project命令即可将该项目生成一个项目模板，生成的项目原型被保存在路径target/generated-sources/archetype
```



```
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.499 s
[INFO] Finished at: 2024-09-01T10:01:18+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] No plugin found for prefix 'archtype' in the current project and in the plugin groups [org.apache.maven.plugins, org.codehaus.mojo] available from the repositories [local (/Users/lg/.m2/repository), alimaven (http://maven.aliyun.com/nexus/content/groups/public/)] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/NoPluginFoundForPrefixException
```

























