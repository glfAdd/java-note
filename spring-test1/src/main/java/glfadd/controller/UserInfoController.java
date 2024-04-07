package glfadd.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import glfadd.dao.UserInfoPO;
import glfadd.mapper.UserInfoMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserInfoController {

    @Resource
    UserInfoMapper userInfoMapper;

    @GetMapping("/user/info")
    public String getUserInfoById() {
        // 使用 Mapper
        List<UserInfoPO> a = userInfoMapper.getUserById(3);

        // 使用 QueryWrapper (这里的字段名是字符串)
        QueryWrapper<UserInfoPO> b1 = new QueryWrapper<>();
        b1.eq("id", 1);
        List<UserInfoPO> b2 = userInfoMapper.selectList(b1);

        // 使用 QueryWrapper lambda
        QueryWrapper<UserInfoPO> b3 = new QueryWrapper<>();
        b3.lambda().eq(UserInfoPO::getId, 3);
        List<UserInfoPO> b4 = userInfoMapper.selectList(b3);

        // 使用 QueryWrapper lambda
        LambdaQueryWrapper<UserInfoPO> b5 = new QueryWrapper<UserInfoPO>().lambda();
        b5.eq(UserInfoPO::getId, 3);
        List<UserInfoPO> b6 = userInfoMapper.selectList(b5);

        // 使用 LambdaQueryWrapper
        LambdaQueryWrapper<UserInfoPO> c1 = new LambdaQueryWrapper<>();
        c1.eq(UserInfoPO::getId, 3);
        List<UserInfoPO> c2 = userInfoMapper.selectList(c1);

        // 分页 (如果不添加分页插件, 分页无效)
        Page<UserInfoPO> p1 = new Page<>(1, 2);
        LambdaQueryWrapper<UserInfoPO> d1 = new LambdaQueryWrapper<>();
        d1.eq(UserInfoPO::getAge, 21);
        userInfoMapper.selectPage(p1, d1);

        log.info("get user info");
        return "123";
    }
}
