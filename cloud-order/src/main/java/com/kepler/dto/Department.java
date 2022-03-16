package com.kepler.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author kepler
 * @Date 2022/3/14 22:52
 * @Version 1.0
 */

@Data
public class Department {
    private Integer id;
    private String departmentName;
    private List<User> userList;
}
