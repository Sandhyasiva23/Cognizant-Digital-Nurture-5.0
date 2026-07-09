package com.example.employee_management_rest.controller;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_management_rest.model.Employee;
import com.example.employee_management_rest.service.EmployeeService;



@RestController
public class EmployeeController {


    private EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService){

        this.employeeService=employeeService;

    }



    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployees(){

        return employeeService.getAllEmployees();

    }

}