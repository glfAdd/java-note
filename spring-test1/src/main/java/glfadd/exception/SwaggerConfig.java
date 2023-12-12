package glfadd.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// 类会作为一个Spring Bean 对象
@Component
// 将 SpringBoot 外部化配置的配置项绑定到其标注的对象，通过访问该对象就能获取配置文件中配置项的值
@ConfigurationProperties("swagger.config")
@Getter
@Setter
public class SwaggerConfig {
    //版本
    private String docVersion;
    //标题
    private String title;
    //描述
    private String description;
    //联系人姓名
    private String contactName;
    //访问路径
    private String contactUrl;
    //联系人邮箱
    private String contactEmail;
    //许可证
    private String license;
    //许可证地址
    private String licenseUrl;

}
