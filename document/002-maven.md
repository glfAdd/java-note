##### 文档

[官网](https://maven.apache.org/download.cgi)

https://www.cnblogs.com/pengpengdeyuan/p/14217772.html
https://www.runoob.com/maven/maven-pom.html

##### 安装

- windows

  ```bash
  1. 安装到 \opt 目录下
  
  2. 添加系统变量
  M2_HOME C:\opt\apache-maven-3.8.2
  MAVEN_HOME C:\opt\apache-maven-3.8.2
  
  3. 添加 PATH 变量
  %M2_HOME%\bin
  %MAVEN_HOME%\bin
  ```

- linux

  ```bash
  1. 下载: apache-maven-3.8.2-bin.zip
  
  2. 文件拷贝到 /opt 
  
  3. 编辑 ~/.zshrc 添加
  vim ~/.zshrc
  export M2_HOME=/opt/apache-maven-3.8.2
  export PATH=$PATH:$M2_HOME/bin
  
  4. 重启
  $ source ~/.zshrc
  ```

- mac

  ```bash
  $ sdk install maven 3.9.6
  ```

##### 配置

```bash
# mvn -v 命令找到并其 Maven home 的目录
# 用户配置优先于全局配置. ${user.home} 和和所有其他系统属性只能在 3.0+版本上使用

# 全局配置
${maven.home}/conf/settings.xml

# 用户配置
${user.home}/.m2/settings.xml
```

```xml
<!-- 本地仓库路径-->
<localRepository>D:\opt\mavenRepository</localRepository>

<!-- 远程源-->
<mirror>  
		<id>alimaven</id>  
		<name>aliyun maven</name>  
		<url>http://maven.aliyun.com/nexus/content/groups/public/</url>
		<mirrorOf>central</mirrorOf>          
</mirror>
```

##### 命令

| 命令                          | 说明                                       |
| ----------------------------- | ------------------------------------------ |
| mvn archetype:generate        | 创建 Maven 项目                            |
| mvn dependency:tree           | 列出项目依赖                               |
| mvn site                      | 生成项目的站点报告，包括各种度量指标和文档 |
| mvn plugin:goal               | 运行 Maven 插件目标                        |
| mvn idea:idea                 | 生成 IDEA 项目文件                         |
| mvn eclipse:eclipse           | 生成 Eclipse 项目文件                      |
| mvn clean                     | 清理项目                                   |
| mvn clean compile             | 只编译不测试构建项目                       |
| mvn clean install -DskipTests | 跳过测试构建项目                           |
| mvn clean install             | 构建项目                                   |
| mvn dependency:sources        | 下载依赖库的源代码                         |
|                               |                                            |
|                               |                                            |
| mvn test                      |                                            |
| mvn -X                        | 查看 mvn 的配置                            |
| mvn help:effective-settings   | 查看 mvn 的配置                            |

```bash
# 查看maven的版本及配置信息
$ mvn -v
$ mvn -version  

# 构建java项目
$ mvn archetype:create -DgroupId=packageName -DartifactId=projectName

# 创建web项目
$ mvn archetype:create -DgroupId=com.glfadd -DartifactId=springboottemplate -DarchetypeArtifactId=maven-archetype-webapp

# 下载 pom.xml 中的文件
$ mvn help:effective-pom

```



```bash
$ mvn clean install -rf :traveller-module-bpm-api
```

```
打包的机制
如pom,jar, maven-plugin, ejb, war, ear, rar, par，默认为 jar

<packaging>war</packaging>
```

##### Maven的三种打包方式

```
1. pom 是 maven 依赖文件
可以作为其他项目的maven依赖，用来做jar包的版本控制。

2. jar 是 java 普通项目打包文件
通常是开发时需要应用的类，当需要某些功能时就导入相应的jar包；以zip包的形式供调用（用命令java -jar xxx.jar执行）。

3. war 常用于 java web 项目工程
用来发布服务，打成war包后部署到服务器访问。可以用zip包的形式使用（java -jar xxx.war执行，前提是配置了main函数入口），也可以用解压缩的形式使用(通常情况下是解压后的war包)。
```

### 打包项目

##### maven 打包

- 修改该 pom.xml 添加

  ```xml
  <project>
      <packaging>jar</packaging>
  
      <build>
          <plugins>
              <plugin>
                  <groupId>org.springframework.boot</groupId>
                  <artifactId>spring-boot-maven-plugin</artifactId>
              </plugin>
          </plugins>
      </build>
  </project>
  
  ```

- 打包

  ```bash
  $ mvn clean package
  
  # 在 target 目录下生成两个jar文件
  # springboot-exec-jar-1.0-SNAPSHOT.jar.original是Maven标准打包插件打的jar包，它只包含我们自己的Class，不包含依赖
  # springboot-exec-jar-1.0-SNAPSHOT.jar是Spring Boot打包插件创建的包含依赖的jar，可以直接运行
  ├── classes
  ├── generated-sources
  ├── maven-archiver
  ├── maven-status
  ├── projecttime-1.0-SNAPSHOT.jar
  └── projecttime-1.0-SNAPSHOT.jar.original
  ```

- 运行

  ```bash
  $ java -jar projecttime-1.0-SNAPSHOT.jar
  
  # 指定运行的内存
  $ nohup java -Xmx1000m -Xms1000m -jar ./target/projecttime-1.0-SNAPSHOT.jar > /dev/null 2>&1 &
  $ nohup java -Xmx500m -Xms500m -jar ./target/projecttime-1.0-SNAPSHOT.jar > /dev/null 2>&1 &
  
  # --server.port 等价于在 application.properties 中添加属性 server.port=8888
  $ nohup java -Xmx1000m -Xms1000m -jar ./target/projecttime-1.0-SNAPSHOT.jar --server.port=11309 > /dev/null 2>&1 &
  ```







### 常见错误

##### 问题 1: 创建项目报错

```
$ mvn archetype:create -DgroupId=com.glfadd -DartifactId=springboottemplate -DarchetypeArtifactId=maven-archetype-webapp
[ERROR] Error executing Maven.
[ERROR] 1 problem was encountered while building the effective settings
[FATAL] Non-parseable settings C:\opt\apache-maven-3.8.2\conf\settings.xml: TEXT must be immediately followed by END_TAG and not STARTTART_TAG seen ...alRepository>C:\opt\apache-maven-3.8.2\maven-repo<localRepository>... @55:73)  @ C:\opt\apache-maven-3.8.2\conf\setti column 73
```

##### 问题 2

```
打包报错
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project projecttime: Fatal error compiling: invalid target release: 11 -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException


原因
pom.xml 和 当前环境 java 的版本不一致
```









