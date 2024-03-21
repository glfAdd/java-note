package glfadd.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.Map;

/*
 * @RestController 标记类用于处理 http 请求, 方法返回值默认会被转换成JSON格式，并通过HTTP响应返回给客户端。
 * 如果需要返回其他格式的数据，可以使用其他注解，比如@ResponseBody
 *
 * */
@RestController // 标记类用于处理 http 方法
@Api(tags = "测试1")
public class HelloController {
    @Autowired
    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    @GetMapping("/t")
    public String t() {
        return "aba123";
    }

    @GetMapping("/showUrls")
    public void showUrls() {
        // 获取所有 url
        Map<RequestMappingInfo, HandlerMethod> handlerMethods = requestMappingHandlerMapping.getHandlerMethods();
        for (Map.Entry<RequestMappingInfo, HandlerMethod> entry : handlerMethods.entrySet()) {
            RequestMappingInfo info = entry.getKey();
            HandlerMethod method = entry.getValue();
            System.out.println(info);
            System.out.println(method);
        }
    }
}
