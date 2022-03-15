package com.kepler.controller;

import com.kepler.dto.Department;
import com.kepler.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author kepler
 * @Date 2022/3/14 22:56
 * @Version 1.0
 */
@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/getDepartments")
    public List<Department> getDepartments() {
        return departmentService.getDepartments();
    }

    @GetMapping(value = "/get/{id}")
    public Department getDepartmentById(@PathVariable("id") Integer id) {
        return departmentService.getDepartment(id);
    }
}
