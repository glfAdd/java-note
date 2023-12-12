package glfadd.controller;

import glfadd.entity.Animal;
import glfadd.entity.User;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;
import java.util.Objects;

// 标记类 / 方法 可以处理 http 请求
@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {
    // url 参数
    @RequestMapping(value = "v1/{name}/{age}", method = RequestMethod.GET)
    @ApiOperation(value = "operation value", notes = "operation notes", httpMethod = "POST")
    public String getUser1(@PathVariable String name, @PathVariable Integer age) {
        System.out.println(name);
        System.out.println(age);
        return name + age;
    }

    // form 表单参数
    @GetMapping("user2")
    public ResponseEntity<String> getUser2(
            // 默认值
            @RequestParam(defaultValue = "Lucy") String name,
            // 允许为空
            @RequestParam(required = false) Integer age) {
        log.info(name);
        return ResponseEntity.ok(name + age);
    }

    // map 接收
    @GetMapping("user3")
    public String getUser3(@RequestParam Map<String, Objects> params) {
        System.out.println(params);
        return "123";
    }

    // 数组接收
    @GetMapping("user4")
    public String getUser4(@RequestParam String[] name) {
        return "getUser4";
    }

    // 对象接收
    @GetMapping("user5")
    public String getUser5(User user) {
        return "getUser5";
    }

    // 两个对象接收
    @GetMapping("user6")
    public String getUser6(User user, Animal animal) {
        return "getUser6";
    }

    @PostMapping("user7")
    public String postUser7(@Valid @RequestBody User user) {
        return "getUser6";
    }
}
