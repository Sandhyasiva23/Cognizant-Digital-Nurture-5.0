package com.employee.Exercise3_EmployeeManagementSystem.repository;
import com.employee.Exercise3_EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    Employee findByEmail(String email);

}