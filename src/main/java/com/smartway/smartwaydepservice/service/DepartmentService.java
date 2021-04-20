package com.smartway.smartwaydepservice.service;

import com.smartway.smartwaydepservice.model.Department;


public interface DepartmentService {

    Department saveDepartment(Department department);
    Department findById(Long departmentId);
}
