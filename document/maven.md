##### 安装

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

