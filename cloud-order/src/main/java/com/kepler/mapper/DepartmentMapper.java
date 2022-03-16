package com.kepler.mapper;

import com.kepler.dto.Department;
import com.kepler.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author kepler
 * @Date 2022/3/14 22:53
 * @Version 1.0
 */

@Mapper
@Repository
public interface DepartmentMapper {
    List<Department> getDepartments();

    Department getDepartment(Integer id);

    List<Department> getUserList(Integer i);
}
