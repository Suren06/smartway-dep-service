package com.smartway.smartwaydepservice.serviceImpl;

import com.smartway.smartwaydepservice.exceptions.DepartmentException;
import com.smartway.smartwaydepservice.model.Department;
import com.smartway.smartwaydepservice.repository.DepartmentRepository;
import com.smartway.smartwaydepservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public Department save(Department department) {
        Department newDepartment = departmentRepository.save(department);
        return newDepartment;
    }

    @Transactional
    public Department findById(Long departmentId) {
        Department department = departmentRepository.findById(departmentId)
            .orElseThrow(() -> new DepartmentException("No Department found with ID - " + departmentId.toString()));
        return department;
    }

    @Transactional
    public Department update(Department department, Long id){
        Department oldDepartment = retrieveById(id);
        return departmentRepository.save(department);
    }

    private Department retrieveById(Long id) {
        Optional<Department> department = departmentRepository.findById(id);

        if (!department.isPresent()) {
            throw new DepartmentException("No Department found with ID - " + id.toString());
        }
        return department.get();
    }


}
