package com.smartway.smartwaydepservice.serviceImpl;

import com.smartway.smartwaydepservice.model.Department;
import com.smartway.smartwaydepservice.repository.DepartmentRepository;
import com.smartway.smartwaydepservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department findById(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
