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

@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    UserLoginService userLoginService;

    @GetMapping("/getAll")
    public List<User> lists(){
        return userLoginService.queryAll();
    }


    @GetMapping(value = "/info/{name}")
    public String getUserInfo(@PathVariable("name") String userName){
        log.info("try to get userInfo by userName!");
        String res =  userLoginService.queryByName(userName).toString();
        return res;
    }
}
