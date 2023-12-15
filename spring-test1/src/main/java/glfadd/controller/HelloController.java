package glfadd.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController 标记类用于处理 http 请求, 方法返回值默认会被转换成JSON格式，并通过HTTP响应返回给客户端。
 * 如果需要返回其他格式的数据，可以使用其他注解，比如@ResponseBody
 *
 * */
@RestController // 标记类用于处理 http 方法
@Api(tags = "测试1")
public class HelloController {

    @GetMapping("/t")
    public String t() {
        return "aba123";
    }
}
