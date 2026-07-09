package com.example.employee_management_rest.dao;


import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.employee_management_rest.model.Department;


@Repository
public class DepartmentDao {


    public static ArrayList<Department> DEPARTMENT_LIST;


    static {


        DEPARTMENT_LIST = new ArrayList<>();


        DEPARTMENT_LIST.add(
                new Department(1,"IT")
        );


        DEPARTMENT_LIST.add(
                new Department(2,"HR")
        );


        DEPARTMENT_LIST.add(
                new Department(3,"Finance")
        );


        DEPARTMENT_LIST.add(
                new Department(4,"Marketing")
        );


    }



    public ArrayList<Department> getAllDepartments(){

        return DEPARTMENT_LIST;

    }

}