package com.smartway.smartwaydepservice.controller;

import com.smartway.smartwaydepservice.model.Department;
import com.smartway.smartwaydepservice.service.DepartmentService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("{/id}")
    public Department findByDepartmentId(@PathVariable Long id){
        return departmentService.findById(id);
    }

}
