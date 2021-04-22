package com.smartway.smartwaydepservice.repository;

import com.smartway.smartwaydepservice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {


}
