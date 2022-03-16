package com.kepler.dto;

import lombok.Data;

/**
 * @Author kepler
 * @Date 2022/3/14 20:59
 * @Version 1.0
 */

@Data
public class User {
    private Integer id;
    private String userId;
    private String userName;
    private String password;
    private String email;
    private Integer depId;
}
