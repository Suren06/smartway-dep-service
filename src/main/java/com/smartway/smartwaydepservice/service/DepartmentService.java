package com.smartway.smartwaydepservice.service;

import com.smartway.smartwaydepservice.model.Department;


public interface DepartmentService {

    Department findById(Long departmentId);
    Department save(Department department);
    Department update(Department department, Long id);
}
