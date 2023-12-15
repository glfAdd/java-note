```
1. Spring Boot 使用 ObjectMapper 实例来序列化响应和反序列化请求



```



##### JsonInclude 属性

```
ALWAYS // 默认策略，任何情况都执行序列化
NON_NULL // 非空
NON_ABSENT // null的不会序列化，但如果类型是AtomicReference，依然会被序列化
NON_EMPTY // null、集合数组等没有内容、空字符串等，都不会被序列化
NON_DEFAULT // 如果字段是默认值，就不会被序列化
CUSTOM // 此时要指定valueFilter属性，该属性对应一个类，用来自定义判断被JsonInclude修饰的字段是否序列化
USE_DEFAULTS // 当JsonInclude在类和属性上都有时，优先使用属性上的注解，此时如果在序列化的get方法上使用了JsonInclude，并设置为USE_DEFAULTS，就会使用类注解的设置  
```



##### @RestController

```
@RestController = @Controller + @ResponseBody
将返回数据写入到响应的 body 中





@ResponseBody 将 Controller 方法返回的对象通过适当的转换器转换为指定的格式之后，写入到HTTP 响应(Response)对象的 body 中


```

##### jackson

```
spring boot 默认 json 框架是  jackson
```

```
1.x 版本的包名是 org.codehaus.jackson
2.x 版本包名变为 com.fasterxml.jackson
```





```
spring-boot-starter-web 默认引入了以下依赖
    jackson-core: 核心包，来生成和解析 JSON
    jackson-annotations: 注解包，提供标准注解功能
    jackson-databind: 数据绑定包
```

```
ObjectMapper 是 JSON 操作的核心, Jackson 的所有 JSON 操作都是在 ObjectMapper 中实现

writeValue(File arg0, Object arg1)把arg1转成json序列，并保存到arg0文件中。
writeValue(OutputStream arg0, Object arg1)把arg1转成json序列，并保存到arg0输出流中。
writeValueAsBytes(Object arg0)把arg0转成json序列，并把结果输出成字节数组。
writeValueAsString(Object arg0)把arg0转成json序列，并把结果输出成字符串。
```



##### 注释

| 注释                  | 说明                                                         |
| --------------------- | ------------------------------------------------------------ |
| @JsonProperty         | 用于属性，把属性的名称序列化时转换为另外一个名称。示例：`@JsonProperty("birth_date") private Date birthDate` |
| @JsonIgnore           | 可用于字段、getter/setter、构造函数参数上，作用相同，都会对相应的字段产生影响。使相应字段不参与序列化和反序列化。 |
| @JsonIgnoreProperties | 该注解是类注解。该注解在Java类和JSON不完全匹配的时候使用。   |
| @JsonFormat           | 用于属性或者方法，把属性的格式序列化时转换成指定的格式。示例：`@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm") public Date getBirthDate()` |
| @JsonPropertyOrder    | 用于类， 和 @JsonProperty 的index属性类似，指定属性在序列化时 json 中的顺序 ， 示例：`@JsonPropertyOrder({ "birth_Date", "name"}) public class Person` |
| @JsonCreator          | 用于构造方法，和 @JsonProperty 配合使用，适用有参数的构造方法。示例：`@JsonCreator public Person(@JsonProperty("name")String name) {…}` |
| @JsonAnySetter        | 用于属性或者方法，设置未反序列化的属性名和值作为键值存储到 map 中 `@JsonAnySetter public void set(String key, Object value) { map.put(key, value); }` |
| @JsonAnyGetter        | 用于方法 ，获取所有未序列化的属性 `@JsonAnyGetter public Map<String, Object> any() { return map; }` |
| @JsonNaming           | 类注解。序列化的时候该注解可将驼峰命名的字段名转换为下划线分隔的小写字母命名方式。反序列化的时候可以将下划线分隔的小写字母转换为驼峰命名的字段名。示例：`@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)` |
| @JsonRootName         | 类注解。需开启`mapper.enable(SerializationFeature.WRAP_ROOT_VALUE)`，用于序列化时输出带有根属性名称的 JSON 串，形式如 `{"root_name":{"id":1,"name":"zhangsan"}}`。但不支持该 JSON 串反序列化。 |

##### springcloud 统一配置

```




```

