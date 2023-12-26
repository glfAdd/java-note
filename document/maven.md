##### 安装

mac

```bash
$ brew install maven
```

```bash
# mvn -v 命令找到并其 Maven home 的目录
# 用户配置优先于全局配置. ${user.home} 和和所有其他系统属性只能在 3.0+版本上使用

# 全局配置
${maven.home}/conf/settings.xml

# 用户配置
${user.home}/.m2/settings.xml
```

