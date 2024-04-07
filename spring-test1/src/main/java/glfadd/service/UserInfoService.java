package glfadd.service;

import glfadd.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
}
