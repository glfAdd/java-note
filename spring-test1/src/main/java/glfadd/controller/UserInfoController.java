package glfadd.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserInfoController {
    @GetMapping("user/info")
    public String getUserInfoById() {
        log.info("get user info");
        return "123";
    }
}
