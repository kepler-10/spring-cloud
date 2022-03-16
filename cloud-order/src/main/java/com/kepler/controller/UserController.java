package com.kepler.controller;

import com.kepler.dto.User;
import com.kepler.service.UserLoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author kepler
 * @Date 2022/3/14 21:29
 * @Version 1.0
 */

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    UserLoginService userLoginService;

    @GetMapping("/getAll")
    public List<User> lists() {
        List<User> res = userLoginService.queryAll();
        return res;
    }

    @PostMapping("/insert")
    public int insertInfo(@RequestBody User user){
        log.info("insert student info into tables");
        int res = userLoginService.add(user);
        return res;
    }

    @GetMapping(value = "/info/{name}/{id}")
    public User getUserInfo(@PathVariable("name") String name, @PathVariable("id")String id){
        log.info("try to get userInfo by userName!");
        User res =  userLoginService.queryByName(name, id);
        log.info(res.toString());
        return res;
    }
}
