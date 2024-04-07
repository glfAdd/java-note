package glfadd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import glfadd.dao.UserInfoPO;

import java.util.List;

public interface UserInfoMapper extends BaseMapper<UserInfoPO> {
    List<UserInfoPO> getUserById(Integer id);
}
