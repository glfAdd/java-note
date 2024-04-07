##### 原理

- [ ] https://www.cnblogs.com/hjwublog/p/10332042.html#autoid-0-0-0 启动过程

```
带有 starter 包的作用
在 Spring Boot 应用中, 可以通过添加 Starter 的依赖来集成和启用相关的功能. Starter 的依赖传递机制会自动引入所有必需的依赖项, 包括其他 Starter 所需的依赖项, 可以使用一个简单的依赖来获取一整套功能
  dynamic-datasource-spring-boot-starter
  mybatis-plus-boot-starter
  spring-boot-starter-log4j2
  knife4j-openapi2-spring-boot-starter
  spring-boot-starter-validation
  
  
  
  
Spring Boot Starter 是一种用于简化和自动化配置 Spring Boot 应用程序的机制, 它由一组依赖、自动配置和其他附加功能组成，可以方便地将常用功能和第三方库集成到 Spring Boot 应用中



Spring Boot Starter 的实现原理和启动过程如下所示

自动配置: Spring Boot Starter 通常包含一个自动配置类, 用于自动配置相关的功能和组件。自动配置类使用 @Configuration 注解进行标记，通过条件注解（@ConditionalOnClass、@ConditionalOnBean、@ConditionalOnProperty等）来确定是否应用自动配置



依赖管理：Spring Boot Starter 通过使用 @EnableAutoConfiguration 注解来启用自动配置。当你在 Spring Boot 应用的 pom.xml 文件中添加了一个Starter 的依赖时, 它会触发 Spring Boot 的自动配置机制





Spring Boot 应用启动过程

1. Spring Boot 应用程序的入口点是 main 方法, 其中使用 SpringApplication.run() 方法来启动应用程序
2. SpringApplication 类负责初始化 Spring 应用程序上下文（ApplicationContext）
3. SpringApplication 根据类路径、注解和其他条件来加载自动配置类，并将其应用于应用程序上下文
4. 自动配置类中的配置将被应用于应用程序上下文，并根据需要创建和配置相关的Bean
5. 应用程序上下文准备就绪后, Spring Boot 会启动嵌入式 Web服务器（如Tomcat或Jetty）, 以提供Web应用程序的服务


```

