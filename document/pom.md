##### maven 源

https://mvnrepository.com/

##### dependencyManagement 作用

对所依赖 jar 包进行版本管理的管理器. pom.xml文件中，jar的版本判断的两种途径

1. 如果 dependencies 里的 dependency 自己没有声明 version 元素, 那么 maven 就到 dependencyManagement 里面去找有没有对该 artifactId 和groupId 进行过版本声明, 如果有，就继承它，如果没有就会报错，告诉你必须为 dependency 声明一个version
2. 如果 dependencies 中的 dependency 声明了 version, 那么无论 dependencyManagement 中有无对该 jar 的 version 声明，都以 dependency 里的 version 为准

```xml
<dependencyManagement>
    <dependencies>
        <!-- spring-cloud-alibaba相关依赖集 -->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-alibaba-dependencies</artifactId>
            <version>${spring.cloud.alibaba.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

##### modules

子模块

```xml
<modules>
  <module>spring-service-1</module>
</modules>
```

##### properties

定义属性和变量

```xml
<properties>
  <maven.compiler.source>8</maven.compiler.source>
  <maven.compiler.target>8</maven.compiler.target>
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

  <spring.cloud.version>2021.0.5</spring.cloud.version>
  <spring.cloud.alibaba.version>2021.0.4.0</spring.cloud.alibaba.version>
  <spring.boot.version>2.7.8</spring.boot.version>
</properties>
```

##### dependency

定义项目依赖

```xml
```



