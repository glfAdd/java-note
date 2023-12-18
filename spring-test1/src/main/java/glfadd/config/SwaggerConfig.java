package glfadd.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.ArrayList;
import java.util.List;

// 类会作为一个Spring Bean 对象
@Component
//// 将 SpringBoot 外部化配置的配置项绑定到其标注的对象，通过访问该对象就能获取配置文件中配置项的值
//@ConfigurationProperties("swagger.config")
// 启动 swagger
@Configuration
@EnableSwagger2WebMvc
// 开启 knife4j 功能
@EnableKnife4j
public class SwaggerConfig {

    // 用户配置
    private ApiInfo webApiInfo() {
        return new ApiInfoBuilder()
                .title("title")
                .description("description")
                .version("1.1")
                .contact(new Contact("name", "http://www.baidu.com", "123@qq.com"))
                .build();
    }

    // admin 配置

    @Bean
    // Swagger的实例是Docket，所以我们需要通过Docket来配置Swagger
    public Docket webApiConfig() {
        Docket d = new Docket(DocumentationType.SWAGGER_2)
                .enable(true)// 是否启动 swagger
                .apiInfo(webApiInfo())
                .groupName("group name 1")
                .select() // 哪些接口暴露给Swagger展示
                .apis(RequestHandlerSelectors.basePackage("glfadd.controller")) // controller 扫描路径
                .paths(PathSelectors.any())// 路径选择器
                .build();
//        // 配置全局参数方式 1
//        d.securityContexts(securityContexts());
//        // 配置全局参数方式 2
//        d.securitySchemes(securitySchemes());
        return d;
    }

    // 指定token通过Authorization头请求头传递
    private List<SecurityScheme> securitySchemes() {
        List<SecurityScheme> apiKeyList = new ArrayList<SecurityScheme>();
        apiKeyList.add(new ApiKey("Authorization", "Authorization", "header"));
        return apiKeyList;
    }

    // 安全上下文
    private List<SecurityContext> securityContexts() {
        List<SecurityContext> securityContexts = new ArrayList<>();
        securityContexts.add(
                SecurityContext.builder()
                        .securityReferences(defaultAuth())
                        .build());
        return securityContexts;
    }

    private List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        List<SecurityReference> securityReferences = new ArrayList<>();
        securityReferences.add(new SecurityReference("Authorization", authorizationScopes));
        return securityReferences;
    }
}
