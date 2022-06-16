package com.spring.restapi.simpleRestApi.service;

import com.spring.restapi.simpleRestApi.model.Employee;
import com.spring.restapi.simpleRestApi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee findEmployeeByFirstName(String firstName) {
        Employee employee = employeeRepository.findEmployeeByFirstName(firstName);

        return employee;
    }

    @Override
    @Transactional
    public List<Employee> findAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();

        return employees;
    }

    @Override
    @Transactional
    public Employee findEmployeeById(long id){
        return employeeRepository.findEmployeeById(id);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.delete(employeeRepository.findEmployeeById(id));

    }
}
