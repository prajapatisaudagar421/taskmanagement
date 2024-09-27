package com.example.taskmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskmanagement.entity.Employee;
import com.example.taskmanagement.services.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
        //return "You Received All Employees List";
    }
    @PostMapping
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Employee createEmployees(@RequestBody Employee employee){
        return employeeService.savEmployee(employee);
    }

    @PutMapping
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String updateEmployees(){
        return "You updated a Employee";
    }

}
