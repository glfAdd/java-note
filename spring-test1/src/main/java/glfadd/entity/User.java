package glfadd.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@ApiModel("用户实体类")
public class User {
    @ApiModelProperty(
            value = "姓名", // 字段说明
            name = "name",// 重写属性名
            dataType = "String",// 重写类型
            required = false, // 是否必填
            example = "Tom",// 举例
            hidden = false // 是否隐藏
    )
    private String name;
    private Integer age;

    // 定义属性名
    @JsonProperty("aaa")
    private String a;
    // 忽略这个字段
    @JsonIgnore
    private String b;
    // ALWAYS 默认
    // NON_NULL 不为空时序列化
    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String c;
}
