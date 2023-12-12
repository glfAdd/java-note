package glfadd.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class User {
    @NotNull(message = "name 不能为空")
    private String name;
    @Max(100)
    @Min(1)
    private Integer age;
}
