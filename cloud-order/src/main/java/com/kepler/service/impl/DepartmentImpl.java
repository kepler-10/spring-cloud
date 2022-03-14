package com.kepler.service.impl;

import com.kepler.dto.Department;
import com.kepler.mapper.DepartmentMapper;
import com.kepler.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author kepler
 * @Date 2022/3/14 22:57
 * @Version 1.0
 */

@Service
public class DepartmentImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartments() {
        return departmentMapper.getDepartments();
    }

    @Override
    public Department getDepartment(Integer id) {
        return departmentMapper.getDepartment(id);
    }
}
