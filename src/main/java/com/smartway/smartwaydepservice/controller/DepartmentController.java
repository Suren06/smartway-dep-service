package com.smartway.smartwaydepservice.controller;

import com.smartway.smartwaydepservice.model.Department;
import com.smartway.smartwaydepservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import static org.springframework.http.ResponseEntity.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.save(department));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Department> updateDepartment(@RequestBody Department department, @PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.update(department, id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> findByDepartmentId(@PathVariable Long id) {
        return status(HttpStatus.OK).body(departmentService.findById(id));
    }

}
