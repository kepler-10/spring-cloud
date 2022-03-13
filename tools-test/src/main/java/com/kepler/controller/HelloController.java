package com.kepler.controller;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @Author kepler
 * @Date 2022/2/26 22:16
 * @Version 1.0
 */

@RestController
public class HelloController {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static final RateLimiter rateLimiter = RateLimiter.create(2);

    @GetMapping("/sayHello")
    public String sayHello(){
        if (rateLimiter.tryAcquire()){
            System.out.println(sdf.format(new Date()));
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else {
            System.out.println("limit");
        }
        return "hello";
    }

    @GetMapping("/sayHi")
    public String sayHi(){
        System.out.println("一次拿5个");
        rateLimiter.acquire(5);
        return "hi";
    }

}
