package com.kepler.mapper;

import com.kepler.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author kepler
 * @Date 2022/3/14 20:56
 * @Version 1.0
 */

@Mapper
@Repository
public interface UserInfoMapper {
    //查询
    public List<User> queryAll();

    //添加数据
    public int add(User user);

    //根据用户名查询数据
    public User queryByName(@Param("userName") String name, @Param("userId")String id);
}
