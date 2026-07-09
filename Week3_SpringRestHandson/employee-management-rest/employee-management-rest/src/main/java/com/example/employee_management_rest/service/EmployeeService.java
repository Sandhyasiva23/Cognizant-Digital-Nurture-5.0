package com.example.employee_management_rest.service;


import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.employee_management_rest.dao.EmployeeDao;
import com.example.employee_management_rest.model.Employee;


@Service
public class EmployeeService {


    private EmployeeDao employeeDao;


    public EmployeeService(EmployeeDao employeeDao){

        this.employeeDao=employeeDao;

    }



    @Transactional
    public ArrayList<Employee> getAllEmployees(){

        return employeeDao.getAllEmployees();

    }


}