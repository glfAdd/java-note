

##### 参考

- [ ] https://www.cnblogs.com/xfeiyun/p/16182946.html
- [ ] https://blog.csdn.net/qq_46138492/article/details/129477550?spm=1001.2101.3001.6650.12&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7ERate-12-129477550-blog-104222542.235%5Ev43%5Epc_blog_bottom_relevance_base7&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7ERate-12-129477550-blog-104222542.235%5Ev43%5Epc_blog_bottom_relevance_base7&utm_relevant_index=18
- [ ] 

```



```

##### 配置文件

`classpath` 指的路径是 `src/main/resources`

`classpath:` 只会加载类路径下的指定路径中的资源，而不会递归查找子路径中的资源

`classpath*:` 则会递归查找类路径下的所有路径中的资源，并返回所有匹配的资源

```yaml
# src/main/resources/mybatis-config.xml

mybatis-plus:
  mapper-locations: classpath*:mapper/*.xml
  configuration-location: classpath:mybatis-config.xml
```

指定绝对路径

```yaml
mybatis-plus:
  configuration-location: /path/to/mybatis-config.xml
```

指定相对路径或绝对路径

```yaml
mybatis-plus:
  configuration-location: file:./config/mybatis-config.xml
```

##### xml 文件语法

`mapper` 映射器标签，定义了一个 Mapper 文件

`namespace` 指定 Mapper 接口的全限定名

`select` ` insert` ` update` ` delete` SQL 操作标签

`id` 属性指定了操作的名称

`parameterType` 指定了参数类型

`resultType` 指定了返回结果的类型



```java
public class UserQuery {
    private Long id;
    private String name;
}
```



```xml
<mapper namespace="com.example.myapplication.mapper.UserMapper">
    <!-- 定义 SQL 映射关系 -->
    <select id="getUserById" parameterType="int" resultType="com.example.myapplication.model.User">
        SELECT * FROM user WHERE id = #{id}
    </select>
    <select id="getUserByIdAndName" parameterType="com.example.UserQuery" resultType="com.example.User">
        SELECT * FROM user WHERE id = #{id} AND name = #{name}
    </select>
</mapper>
```



xml 文件传进来的参数

##### 函数

<img src="./image/mybatis 函数.png" alt="mybatis 函数" style="zoom:70%;" />

```
```

