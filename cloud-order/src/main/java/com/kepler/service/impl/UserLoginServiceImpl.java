package com.kepler.service.impl;

import com.kepler.dto.User;
import com.kepler.mapper.UserInfoMapper;
import com.kepler.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author kepler
 * @Date 2022/3/14 21:27
 * @Version 1.0
 */

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<User> queryAll() {
        return userInfoMapper.queryAll();
    }

    @Override
    public int add(User user) {
        return userInfoMapper.add(user);
    }

    @Override
    public User queryByName(String name, String id) {
        return userInfoMapper.queryByName(name, id);
    }
}
