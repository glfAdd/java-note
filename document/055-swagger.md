# swagger

##### web 地址

```
http://localhost:8080/swagger-ui/index.html
或
http://localhost:8080/swagger-ui.html
```







# knife4j

[官网](https://doc.xiaominfo.com/)

版本

```
Spring Boot 2 + OpenAPI2

Spring Boot 3 + OpenAPI3
```

##### web 地址

```
http://localhost:8080/doc.html
```





##### @ApiImplicitParams

```

```

##### @ApiImplicitParam

```java
@ApiImplicitParam(name = "name", value = "Name of the user", required = true, dataType = "String", paramType = "query")

name: 参数的名称
value: 参数的描述
defaultValue: 默认值
required: 是否必填，默认 false
dataType: 数据类型
paramType: 参数的类型，可以是 query、path、header、body 或 form
```





##### @Api

> 修饰 controller 类
>  	tags：类的说明，但是tags如果有多个值，会生成多个list
>  	value：类的说明
> 	~~description: 描述信息~~

```java
import io.swagger.annotations.Api;

@Api(value = "健康检测", tags = {"健康检测1", "健康经检测2"})
public class HealthController {
}
```

##### @ApiOperation

> 修饰 controller 的方法
> 	value：用于方法描述 
> 	notes：用于提示内容 
> 	tags：可以重新分组

##### @ApiParam

> 修饰方法的参数
>   value	参数的描述信息，显示在 Swagger UI 中。
>   name	参数名称，通常可以省略（默认会根据方法签名推断）。
>   required	是否必填，默认为 false。
>   defaultValue	参数的默认值。
>   allowableValues	参数的可选值列表，例如 "value1, value2, value3"。
>   example	参数的示例值（对 Swagger UI 很有帮助）。

```




```





