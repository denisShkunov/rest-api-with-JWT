package com.spring.restapi.simpleRestApi.controller;

import com.spring.restapi.simpleRestApi.model.Employee;
import com.spring.restapi.simpleRestApi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private final EmployeeService employeeService;

    public RestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee showEmployeeById( @PathVariable(name = "id" ) long id){
        return employeeService.findEmployeeById(id);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable(name = "id") long id){
        employeeService.deleteEmployee(id);
        return "employee with id = "+id+"was deleted";
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }


    //Необходимо исправить и добавить ID так чтобы спринг понимал mployee которого нужно изменить
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }
}
