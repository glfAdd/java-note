```
IoC
AOP

POJO (PlainOld Java Object) 无限制的普通 java 对象


每个被 spring 管理的 java 对象被称为 Bean
Spring 提供 IoC 容器来初始化对象, 解决对象间的依赖和对象的使用





```

##### Spring 模块

```
核心容器 Core Container
  Spring-Core: 核心工具, Spring 其他模块大量使用 Spring-Core
  Spring-Beans: Spring 定义 Bean 的支持
  Spring-Context: 运行时 Spring 容器
  Spring-Context-Support: Spring 容器对第三方包的集成支持
  Spring-Expression: 使用表达式语言在运行时查询和操作对象


AOP
  Spring-AOP: 基于代理的 AOP 支持
  Spring-Aspects: 基于 AspectJ 的 AOP 支持


消息 Message
	Spring-Message: 对消息架构和协议的支持


Web
  Spring-Web: 提供基础的 Web 集成功能, 在 Web 项目中提供 Spring 的容器
  Spring-Webmvc: 提供基于 Servlet 的 SpringMVC
  Spring-WebSocket: 提供 WebSocket 功能
  Spring-WebSocket-Portlet: 提供 Portlet 环境支持
  Spring-Webmvc-Portlet: 提供 Portlet 环境支持


数据访问/集成 (Data Access/Integraion)
  Spring-JDBC: 提供以 JDBC 访问数据库的支持
  Spring-TX: 提供编程式和声明式的事务支持
  Spring-ORM: 提供对对象/关系映射支持
  Spring-OXM: 提供对对象/xml映射支持
  Spring-JMS: 提供对 JMS 的支持
```

##### Spring 项目

```
Spring Boot: 使用默认配置实现快速开发
Spring Cloud: 为分布式系统开发提供工具集
Spring Data: 对主流的关系型和 NoSQL 数据库的支持
Spring LDAP: 简化使用 LDAP 开发
Spring Session: 管理会话
```

##### Maven

```
管理项目依赖, 编译, 文档等
Maven 管理的项目时, 项目依赖的 jar 包不在包含在项目内, 而集中放置在用户目录 .m2 文件夹下
```

