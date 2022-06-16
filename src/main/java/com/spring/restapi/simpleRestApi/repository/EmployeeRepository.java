package com.spring.restapi.simpleRestApi.repository;

import com.spring.restapi.simpleRestApi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee findEmployeeByFirstName(String firstName);
    public Employee findEmployeeById(long id);
}
