package com.example.employee_management_rest.service;


import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.employee_management_rest.dao.DepartmentDao;
import com.example.employee_management_rest.model.Department;



@Service
public class DepartmentService {


    private DepartmentDao departmentDao;



    public DepartmentService(DepartmentDao departmentDao){

        this.departmentDao = departmentDao;

    }



    @Transactional
    public ArrayList<Department> getAllDepartments(){

        return departmentDao.getAllDepartments();

    }


}