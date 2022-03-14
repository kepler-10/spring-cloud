package com.kepler.service;

import com.kepler.dto.Department;

import java.util.List;

/**
 * @Author kepler
 * @Date 2022/3/14 22:57
 * @Version 1.0
 */


public interface DepartmentService {
    List<Department> getDepartments();

    Department getDepartment(Integer id);
}
