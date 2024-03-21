##### @RestController

```
```



##### @ResponseBody

```
```



##### @Controller

```
```



##### @RequestParam

```
用于从 HTTP 请求中获取请求参数的值。通常情况下，它用于控制器（Controller）方法的参数上，以获取客户端通过查询字符串（URL 参数）或表单提交发送的请求参数





```



##### @PreAuthorize

```



```

##### Mapping

```
GetMapping
PostMapping
PutMapping
DeleteMapping
RequestMapping
```

##### @FeignClient

```java
用于声明一个基于接口的远程服务客户端, 可以在不编写实际的实现类的情况下，定义一个接口来调用远程服务的 HTTP API

value: 指定要调用的远程服务的服务名称。
url: 指定要调用的远程服务的 URL 地址。
path: 指定要调用的远程服务的基础路径。
fallback: 指定一个断路器（Hystrix）的回退类，在远程服务不可用时执行回退逻辑。
configuration: 指定一个 Feign 客户端的配置类

  
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "example-service", url = "http://example.com")
public interface ExampleServiceClient {
    @GetMapping("/api/resource")
    String getResource();
}
```

##### @PathVariable

```java
从请求路径中获取变量值
value：指定路径变量的名称。如果不指定，则默认使用方法参数的名称。
required：指定路径变量是否为必需的，默认为 true。如果设置为 false，并且请求路径中不存在该变量，则方法参数会被设置为 null。  
  

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        return "Hello, " + name + "!";
    }
}
```

