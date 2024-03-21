##### @ApiOperation

```java
// 描述接口信息, 如操作的摘要、详细说明、响应信息等，这些信息可以被 Swagger UI 等工具用来生成 API 文档
@ApiOperation(value = "Example API", notes = "This is an example API")

value: 简要信息
notes: 详细信息
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

```java
// 用于描述一个 RESTful Web 服务的整个 API。用在控制器 Controller 类上, 用来为整个控制器生成 API 文档
value: API 的名称或标题
tags: 为 API 分配一个或多个标签，用于组织和分类 API 文档
description: API 的描述信息

  
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Calculator API", description = "Operations for basic arithmetic calculations")
public class CalculatorController {
    // Controller methods...
}
```

