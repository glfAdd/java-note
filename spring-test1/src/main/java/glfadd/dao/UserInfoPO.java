package glfadd.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user_info")
@Data
public class UserInfoPO {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;

    private String phone;
}
