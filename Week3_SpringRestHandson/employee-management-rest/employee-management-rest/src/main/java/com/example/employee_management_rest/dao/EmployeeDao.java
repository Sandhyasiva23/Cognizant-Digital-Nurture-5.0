package com.example.employee_management_rest.dao;


import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

import com.example.employee_management_rest.model.Employee;


@Repository
public class EmployeeDao {


    public static ArrayList<Employee> EMPLOYEE_LIST;


    static {

        EMPLOYEE_LIST = new ArrayList<>();


        EMPLOYEE_LIST.add(
                new Employee(
                        1,
                        "John",
                        "IT",
                        50000,
                        Arrays.asList("Java","Spring")
                )
        );


        EMPLOYEE_LIST.add(
                new Employee(
                        2,
                        "Smith",
                        "HR",
                        45000,
                        Arrays.asList("Communication","Management")
                )
        );


        EMPLOYEE_LIST.add(
                new Employee(
                        3,
                        "David",
                        "Finance",
                        60000,
                        Arrays.asList("SQL","Excel")
                )
        );


        EMPLOYEE_LIST.add(
                new Employee(
                        4,
                        "Alex",
                        "IT",
                        55000,
                        Arrays.asList("Java","React")
                )
        );

    }



    public ArrayList<Employee> getAllEmployees(){

        return EMPLOYEE_LIST;

    }

}