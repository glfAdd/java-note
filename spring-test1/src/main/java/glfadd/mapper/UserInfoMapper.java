package glfadd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import glfadd.dao.UserInfoPO;

import java.util.List;

public interface UserInfoMapper extends BaseMapper<UserInfoPO> {
    /**
     * 获取用户信息
     *
     * @param id
     * @return
     */
    List<UserInfoPO> getUserById(Integer id);
}
