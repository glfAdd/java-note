package glfadd.controller;

import glfadd.entity.Animal;
import glfadd.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

// 标记类 / 方法 可以处理 http 请求
@RestController
@RequestMapping("/api")
@Slf4j
@Api(tags = "测试2")
public class UserController {
    // url 参数
    @RequestMapping(value = "/v1/{name}/{age}", method = RequestMethod.GET)
    @ApiOperation(value = "用户1", notes = "getUser1 notes")
    public String getUser1(@PathVariable String name, @PathVariable Integer age) {
        System.out.println(name);
        System.out.println(age);
        return name + age;
    }

    // form 表单参数
    @GetMapping("/user2")
    @ApiOperation(value = "用户2", notes = "getUser2 notes")
    public ResponseEntity<String> getUser2(
            @RequestParam(defaultValue = "Lucy") String name,
            @RequestParam(required = false) Integer age) {
        log.info(name);
        return ResponseEntity.ok(name + age);
    }

    // map 接收
    @GetMapping("/user3")
    @ApiOperation(value = "用户3", notes = "getUser3 notes")
    public String getUser3(@RequestParam Map<String, Objects> params) {
        System.out.println(params);
        return "123";
    }

    // 数组接收
    @GetMapping("/user4")
    public String getUser4(@RequestParam String[] name) {
        return "getUser4";
    }

    // 对象接收
    @GetMapping("/user5")
    public String getUser5(User user) {
        return "getUser5";
    }

    // 两个对象接收
    @GetMapping("/user6")
    public User getUser6(User user, Animal animal) {
        User u = new User();
        u.setAge(12);
        u.setName("Toom");
        return u;
    }

    @PostMapping("/user7")
    public String postUser7(@Valid @RequestBody User user) {
        return "getUser6";
    }
}
