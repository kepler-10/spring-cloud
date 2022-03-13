package com.kepler.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kepler
 * @Date 2021/11/25 22:08
 * @Version 1.0
 */
@RestController
@RequestMapping("/pay")
public class PaymentController {
    @RequestMapping("/get")
    public String getId(){
        return "success~";
    }
}
