##### TODO

```
https://www.cnblogs.com/wl20200316/p/12579982.html 单例


@Quailfer
@ConditionalOnBean
```

## Application

### @SpringBootApplication

```
标识一个 Spring Boot 应用程序的启动类
```

### @Component 

```

```

### @Configuration

```
标识该类是一个配置类，通常用于定义配置信息、Bean 的定义等
表示类作为 bean 定义的源
```

##### Configuration 底层定义

```java
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Configuration {
    @AliasFor(
        annotation = Component.class
    )
    String value() default "";

    boolean proxyBeanMethods() default true;
}
```

```
@ConditionalOnBean，仅在当前上下文中存在某个bean时，才会实例化这个Bean。
@ConditionalOnClass，某个class位于类路径上，才会实例化这个Bean。
@ConditionalOnExpression，当表达式为true的时候，才会实例化这个Bean。
@ConditionalOnMissingBean，仅在当前上下文中不存在某个bean时，才会实例化这个Bean。
@ConditionalOnMissingClass，某个class在类路径上不存在的时候，才会实例化这个Bean。
@ConditionalOnNotWebApplication，不是web应用时才会实例化这个Bean。
@AutoConfigureAfter，在某个bean完成自动配置后实例化这个bean。
@AutoConfigureBefore，在某个bean完成自动配置前实例化这个bean。




```



### @EnableAutoConfiguration

```
启用 Spring Boot 的自动配置机制，根据项目中的依赖和配置，自动配置 Spring 应用程序的环境
```

### @ComponentScan

```
启用组件扫描，自动扫描并注册 Spring 应用程序中的组件（包括 @Component、@Service、@Controller、@Repository 等）
```

### @Bean

注解的方法返回的类型都会直接注册为 bean

```

```





### @ConfigurationProperties

@ConfigurationProperties 和 @value 有着相同的功能, 但 @ConfigurationProperties 的写法更为方便

@ConfigurationProperties 的 POJO 类的成员变量名称必须和 prefix 的后缀名要一致, 不然值会绑定不上. 特殊的后缀名是 "driver-class-name" 这种带横杠的情况, 在POJO里面的命名规则是"下划线转驼峰"就可以绑定成功，所以就是 "driver-class-name"

##### 例子 1

application.properties

```properties
spring.datasource.username=root
```

DatasourcePro.java

```java
@ConfigurationProperties(prefix = "spring.datasource")
@Component
public class DatasourcePro {
    private String username;
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
}
```

AbaController.java

```java
@Controller
@RequestMapping(value = "/config")
public class AbaController {
    @Autowired
    private DatasourcePro datasourcePro;
    
    @RequestMapping("/test")
    @ResponseBody
    public Map<String, Object> test(){
        Map<String, Object> map = new HashMap<>();
        map.put("userName", datasourcePro.getUsername());
        return map;
    }
}
```

##### 例子 2

application.properties

```yaml
spring.datasource.druid.write.url=jdbc:mysql://localhost:3306/jpa
spring.datasource.druid.write.username=root
spring.datasource.druid.write.password=1
spring.datasource.druid.write.driver-class-name=com.mysql.jdbc.Driver

spring.datasource.druid.read.url=jdbc:mysql://localhost:3306/jpa
spring.datasource.druid.read.username=root
spring.datasource.druid.read.password=1
spring.datasource.druid.read.driver-class-name=com.mysql.jdbc.Driver
```

AbaController.java

```java
// 类用 @Configuration
// 方法用 @Bean 和 @ConfigurationProperties

@Configuration
public class AbaController {
    @ConfigurationProperties(prefix = "spring.datasource.druid.read")
    @Bean(name = "readDruidDataSource")
    public DataSource readDruidDataSource() {
        return new DruidDataSource();
    }

    @ConfigurationProperties(prefix = "spring.datasource.druid.write")
    @Bean(name = "writeDruidDataSource")
    @Primary
    public DataSource writeDruidDataSource() {
        return new DruidDataSource();
    }
}
```

### @ConditionalOnMissingBean

##### 作用

用来修饰 bean, 保证相同类型的 bean 只有一个, 注册多个相同的 bean 时, 会出现异常

```
```

##### 例子

```java
aMapper1上面标识了AMapper类型的bean只能有一个实现 @ConditionalOnMissingBean(AMapper.class)，所以在进行aMapper2注册时，系统会出现上面图上的异常
去掉 @ConditionalOnMissingBean(AMapper.class) 后，bean 可以注册多次，这时需要用的@Primary来确定你要哪个实现；
    
一般来说，对于自定义的配置类，我们应该加上@ConditionalOnMissingBean注解，以避免多个配置同时注入的风险。


@Component
public class AutoConfig {
  @Bean
  public AConfig aConfig() {
    return new AConfig("lind");
  }

  @Bean
  @ConditionalOnMissingBean(AMapper.class)
  public AMapper aMapper1(AConfig aConfig) {
    return new AMapperImpl1(aConfig);
  }

  @Bean
  public AMapper aMapper2(AConfig aConfig) {
    return new AMapperImpl2(aConfig);
  }
}
```







### @Validator

##### 步骤

```
1. 解析请求参数时加上 @Valid
2. 定义统一处理 response 的类
3. @ControllerAdvice 给控制器添加方法
4. @ExceptionHandler 捕获异常
5. 解析异常返回数据




```



##### Hibernate Validator

| 校验注解  | 数据类型                                  |                                                              |
| --------- | ----------------------------------------- | ------------------------------------------------------------ |
| @NotNull  | 任意类型                                  | 不为null                                                     |
| @Null     | 任意类型                                  | 是null                                                       |
| @NotBlank | 字符串                                    | 字符串不为空（不为null、去除首位空格后长度不为0）            |
| @NotEmpty | CharSequence子类型、Collection、Map、数组 | 验证注解的元素值不为null且不为空（字符串长度不为0，集合大小不为0 |



```
@Valid	任何非原子类型，级联验证。比如验证User对象的属性Address对象	指定递归验证关联的对象如用户对象中有个地址对象属性，如果想在验证用户对象时一起验证地址对象，在地址对象上加@Valid注解即可级联验证。
@AssertFalse	Boolean，boolean	验证注解的元素值是false
@AssertTrue	Boolean，boolean	验证注解的元素值是true
@Min(value=xxx)	BigDecimal，BigInteger，byte，short，int，long，等任何Number或CharSequence（存储的是数字）子类型，，	验证注解的元素值大于等于@Min指定的value值
@Max(value=xxx)	和@Min要求一样	验证注解的元素值小于等于@Max指定的value值
@DecimalMax(value=xxx)	和@Min要求一样	验证注解的元素值小于等于@DecimalMax指定的value值
@DecimalMin(value=xxx)	和@Min要求一样	

验证注解的元素值大于等于@DecimalMin指定的value值
@Digits(integer=整数位数，fraction=小数位数)	和@Min要求一样	验证注解的元素值的整数位数和小数位数的上限
@Size(min=下限，max=上限)	字符串、Collection、Map、数组等	验证注解的元素值在min和max（包含）指定区间之内，如字符长度、集合大小
@Past	java.util.Date，java.util.Calendar，Joda Time类库的日期类型	验证注解的元素值（日期类型）比当前时间早
@Future	与@Past要求一样	验证注解的元素值（日期类型）比当前时间晚
@Length(min=下限，max=上限)	CharSequence子类型	验证注解的元素值长度在min和max区间内
@Range(min=最小值，max=最大值)	BigDecimal，BigInteger，CharSequence，byte，short，int，long等原子类型和包装类型	验证注解的元素值在最小值和最大值之间
@Email(regexp=正则表达式，flag=标志的模式)	CharSequence子类型（如String）	验证注解的元素值是Email，也可以通过regexp和flag指定自定义的email格式
@Pattern(regexp=正则表达式，flag=标志的模式)	String，任何CharSequence的子类型	验证注解的元素值与指定的正则表达式匹配

```

##### spring 校验

```
@Validated      	任何非原子类  	@Valid：没有分组的功能; @Valid：可以用在方法、构造函数、方法参数和成员属性（字段）上; @Validated：提供了一个分组功能，可以在入参验证时，根据不同的分组采用不同的验证机制; @Validated：可以用在类型、方法和方法参数上。但是不能用在成员属性（字段）上; 两者是否能用于成员属性（字段）上直接影响能否提供嵌套验证的功能。

```

### @Value

##### 作用

@Value 是 Spring 框架功能, 作用是通过注解将常量, 配置文件中的值, 其他bean的属性值注入到变量中，作为变量的初始值

##### 常量注入

配置不灵活, 功能变更需要修改代码

```java
// 注入普通字符串
@Value("Jack")
private String username; 

// 注入文件资源
@Value("classpath:com/test/config.xml")
private Resource resource; 

// 注入URL资源
@Value("http://www.baidu.com")
private Resource url; 
```

##### 读取配置文件

读取配置文件的值，注入到变量中去. 配置文件分为默认配置文件 application.properties 和自定义配置文件.

application.yml 文件

```yaml
myUserName: 张三
```

java

```java
@Value("${myUserName}")
private String myUserName;
```

##### 读取 bean 属性

bean 对象

```java
@Data
@Component
public class User {
    private String id;
    private String username;
}
```

java

```java
@Value("#{user.username}")
private String username;
```

##### 默认值

如果` a.b.c` 不存在, `aa bb` 为默认值

```java
@Value("${a.b.c:aa bb}")
private String name;

// 默认值为空
@Value("${a.b.c:}")
private String name;
```

##### 声明变量时

```java
public static class FieldValueTestBean {
    @Value("#{ systemProperties['user.region'] }")
    private String defaultLocale;
}
```

##### setter 中

```java
public static class PropertyValueTestBean {
    private String defaultLocale;
    @Value("#{ systemProperties['user.region'] }")
    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }
}
```

##### 方法中

```java
public class SimpleMovieLister {
    private MovieFinder movieFinder;
    private String defaultLocale;
    @Autowired
    public void configure(MovieFinder movieFinder,
            @Value("#{ systemProperties['user.region'] }") String defaultLocale) {
        this.movieFinder = movieFinder;
        this.defaultLocale = defaultLocale;
    } 
}
```

##### 构造方法

```java
public class MovieRecommender {
    private String defaultLocale;
    private CustomerPreferenceDao customerPreferenceDao;
    @Autowired
    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao,
            @Value("#{systemProperties['user.country']}") String defaultLocale) {
        this.customerPreferenceDao = customerPreferenceDao;
        this.defaultLocale = defaultLocale;
    }
}
```

##### 数据类型

```java
// 基本类型
@Value("${some.key:true}")
private boolean booleanWithDefaultValue;
// 包装类型
@Value("${some.key:true}")
private Boolean booleanWithDefaultValue;
// 数组
@Value("${some.key:1,2,3}")
private int[] intArrayWithDefaults;
```

##### 指定配置文件

```java
@PropertySources(value={
    @PropertySource(value={"classpath:xxx.properties"}),
    @PropertySource(value={"classpath:yyy.properties"}),
})
public static class FieldValueTestBean {
    @Value("#{ systemProperties['user.region'] }")
    private String defaultLocale;
}


@PropertySource(value = "classpath:daoconfig/datasource-config.properties")
public static class FieldValueTestBean {
    @Value("#{ systemProperties['user.region'] }")
    private String defaultLocale;
}
```

### @Autowired

```
 默认按类型装配，如果我们想使用按名称装配，可以结合@Qualifier注解一起使用
 
 
 
```

### @Qualifier

```

```

##### 例子 1

有 Employee 类型的 zhangSanEmployee() 和 liSiEmployee() 两个 Bean

与 @Autowired 一起应用于注入, Spring 会抛出 NoUniqueBeanDefinitionException 异常

使用 @Qualifier("beanName") 注解, 通过别名控制访问相同类型

PrimaryConfig.java

```java
@Configuration
public class PrimaryConfig {

   @Bean
   @Qualifier("zhangSanEmployee")
   public Employee zhangSanEmployee() {
       return new Employee("张三");
   }

   @Bean
   @Qualifier("liSiEmployee")
   public Employee liSiEmployee() {
       return new Employee("李四");
   }
}
```

注入依赖

```java
@Resource
private Employee zhangSanEmployee;
@Resource
private Employee liSiEmployee;
```

### @Primary

参考

- [ ] https://blog.csdn.net/niugang0920/article/details/116275748
- [ ] 

##### 作用



```
在依赖注入的过程中，当同一类型存在多个bean时，首先注入使用@Primary 注解的那个

同类型被声明为 Primary 的 bean 最多只能有1个, 多个 Primary 同样会发生 NoUniqueBeanDefinitionException 异常



@Autowired 是根据类型选择的

1. 当一个接口 interface 有多个不同实现类时, 使用注解 @Autowired 时会报. Spring 发现多个类型相同的 bean, 无法根据类型选择装配哪一个。可以使用 @Primary 注解设置默认 bean, 使项目启动时只装配其中一种 bean
2. 自动装配时当出现多个Bean候选者时，被注解为@Primary的Bean将作为首选者，否则将抛出异常



1. 用在自定义的 bean 上面
@Primary
@Bean(value = "child")


2. 用在 class 上面声明 spring 注入的 bean
@Primary
@Component(value = "user")




```



##### 例子 1

```java
// Worker 接口有多个实现，且通过 @Autowired 注入属性, 由于 @Autowired 是通过 byType 形式给指定的字段或方法注入所需的外部资源。Spring无法确定具体注入的类（有多个实现，不知道选哪个），启动会报错并提示
// 当给指定的组件添加@Primary是，默认会注入@Primary配置的组件

public interface Worker {
    public String work();
}

@Component
public class Singer implements Worker {
    @Override
    public String work() {
        return "歌手的工作是唱歌";
    }
}

@Component
@Primary
public class Doctor implements Worker {
    @Override
    public String work() {
        return "医生工作是治病";
    }
}

// 启动，调用接口
@SpringBootApplication
@RestController
public class SimpleWebTestApplication {

    @Autowired
    private Worker worker;

    @RequestMapping("/info")
    public String getInfo(){
        return worker.work();
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebTestApplication.class, args);
    }

}
```

##### 例子 2

用 @Primary 标记 liSiEmployee()bean。 Spring将优先于zhangSanEmployee()注入liSiEmployee()bean

PrimaryConfig.java

```java
@Configuration
public class PrimaryConfig {

    @Bean
    public Employee zhangSanEmployee() {
        return new Employee("张三");
    }

    @Bean
    @Primary
    public Employee liSiEmployee() {
        return new Employee("李四");
    }
}


```



### @SuppressWarnings

##### 作用

告诉编译器忽略指定的警告，不用在编译完成后出现警告信息

可以标注在类、字段、方法、参数、构造方法, 局部变量

##### 用法

```
@SuppressWarnings("")
@SuppressWarnings({})
@SuppressWarnings(value={}

@SuppressWarnings("unchecked")
@SuppressWarnings("unchecked", "deprecation")
@SuppressWarnings({"unchecked", "deprecation"})
@SuppressWarnings(value={"unchecked", "deprecation"})
```

##### 类型

| 关键字                   | 用途                                                         |
| ------------------------ | ------------------------------------------------------------ |
| all                      | to suppress all warnings（抑制所有警告）                     |
| boxing                   | to suppress warnings relative to boxing/unboxing operations（要抑制与箱/非装箱操作相关的警告） |
| cast                     | to suppress warnings relative to cast operations（为了抑制与强制转换操作相关的警告） |
| dep-ann                  | to suppress warnings relative to deprecated annotation（要抑制相对于弃用注释的警告） |
| deprecation              | to suppress warnings relative to deprecation（要抑制相对于弃用的警告） |
| fallthrough              | to suppress warnings relative to missing breaks in switch statements（在switch语句中，抑制与缺失中断相关的警告） |
| finally                  | to suppress warnings relative to finally block that don’t return（为了抑制警告，相对于最终阻止不返回的警告） |
| hiding                   | to suppress warnings relative to locals that hide variable（为了抑制本地隐藏变量的警告） |
| incomplete-switch        | to suppress warnings relative to missing entries in a switch statement (enum case)（为了在switch语句（enum案例）中抑制相对于缺失条目的警告） |
| nls                      | to suppress warnings relative to non-nls string literals（要抑制相对于非nls字符串字面量的警告） |
| null                     | to suppress warnings relative to null analysis（为了抑制与null分析相关的警告） |
| rawtypes                 | to suppress warnings relative to un-specific types when using generics on class params（在类params上使用泛型时，要抑制相对于非特异性类型的警告） |
| restriction              | to suppress warnings relative to usage of discouraged or forbidden references（禁止使用警告或禁止引用的警告） |
| serial                   | to suppress warnings relative to missing serialVersionUID field for a serializable class（为了一个可串行化的类，为了抑制相对于缺失的serialVersionUID字段的警告） |
| static-access            | o suppress warnings relative to incorrect static access（o抑制与不正确的静态访问相关的警告） |
| synthetic-access         | to suppress warnings relative to unoptimized access from inner classes（相对于内部类的未优化访问，来抑制警告） |
| unchecked                | to suppress warnings relative to unchecked operations（相对于不受约束的操作，抑制警告） |
| unqualified-field-access | to suppress warnings relative to field access unqualified（为了抑制与现场访问相关的警告） |
| unused                   | to suppress warnings relative to unused code（抑制没有使用过代码的警告） |

##### 例子

```java
@SuppressWarnings("unchecked")
public void addItems(String item) {
    @SuppressWarnings("rawtypes")
    List items = new ArrayList();
    items.add(item);
}
```

## http

