package com.example.taskmanagement.rep;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.taskmanagement.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
