package com.kepler;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author kepler
 * @Date 2022/3/14 20:55
 * @Version 1.0
 */

@SpringBootApplication
@MapperScan("com.kepler.mapper")
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
