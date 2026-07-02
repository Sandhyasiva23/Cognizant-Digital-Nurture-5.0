package com.employee.Exercise3_EmployeeManagementSystem.repository;


import com.employee.Exercise3_EmployeeManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findByName(String name);

}