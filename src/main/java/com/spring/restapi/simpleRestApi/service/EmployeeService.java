package com.spring.restapi.simpleRestApi.service;

import com.spring.restapi.simpleRestApi.model.Employee;
import com.spring.restapi.simpleRestApi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    public Employee findEmployeeByFirstName(String firstName);

    public List<Employee> findAllEmployees();

    public Employee saveEmployee(Employee employee);

    public void deleteEmployee(long id);

    public Employee findEmployeeById(long id);



}
