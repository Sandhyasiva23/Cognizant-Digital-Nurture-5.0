package com.example.employee_management_rest.controller;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_management_rest.model.Department;
import com.example.employee_management_rest.service.DepartmentService;



@RestController
public class DepartmentController {



    private DepartmentService departmentService;



    public DepartmentController(DepartmentService departmentService){

        this.departmentService = departmentService;

    }



    @GetMapping("/departments")
    public ArrayList<Department> getAllDepartments(){


        return departmentService.getAllDepartments();

    }


}