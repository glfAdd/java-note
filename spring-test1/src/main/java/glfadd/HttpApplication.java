package glfadd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("glfadd.mapper") // 扫描指定路径下的 Mapper
public class HttpApplication {
    public static void main(String[] args) {
        // 启动应用程序
        SpringApplication.run(HttpApplication.class, args);
    }
}
