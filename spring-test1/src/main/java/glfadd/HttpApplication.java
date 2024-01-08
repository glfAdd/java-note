package glfadd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@SpringBootApplication
public class HttpApplication {
    public static void main(String[] args) {
        SpringApplication.run(HttpApplication.class, args);

        Map<String, Objects> a = new HashMap<>();
        String aaa = a.get("kk").toString();

        System.out.println("123123");


    }
}
