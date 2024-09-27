package com.example.taskmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskmanagement.entity.Employee;
import com.example.taskmanagement.rep.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee savEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
