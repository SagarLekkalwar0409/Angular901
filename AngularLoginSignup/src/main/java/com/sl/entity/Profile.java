package com.sl.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String employeeCode;
    private String department;
    private Date joiningDate;
    private String location;
    private String manager;
    private Double salary;

    // Additional fields
    private String epfNo;
    private String uan;
    private String panNumber;
    private String aadharNumber;
    private String branch;
    private String grade;
    private String designation;
    private String employeeCategory;
    private String projectType;

    
}