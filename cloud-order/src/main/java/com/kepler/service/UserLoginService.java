package com.kepler.service;

import com.kepler.dto.User;

import java.util.List;

/**
 * @Author kepler
 * @Date 2022/3/14 21:27
 * @Version 1.0
 */
public interface UserLoginService {
    //查询
    public List<User> queryAll();

    //添加数据
    public int add(User user);

    //根据用户名查询数据
    public User queryByName(String name, String id);
}
