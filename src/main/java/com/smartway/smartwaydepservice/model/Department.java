package com.smartway.smartwaydepservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long departmentId;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "department_address")
    private String departmentAddress;
    @Column(name = "department_code")
    private String departmentCode;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "updated_date")
    private Date updatedDate;
    @Column(name = "is_active")
    private Boolean is_active;

}
