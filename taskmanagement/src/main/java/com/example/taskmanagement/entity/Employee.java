package com.example.taskmanagement.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Document(collection="employee")
public class Employee {
    @Id
    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;
    // @Id
    // private String id;
    // private String name;
    // private int age;
    // public String getId() {
    //     return id;
    // }
    // public void setId(String id) {
    //     this.id = id;
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public int getAge() {
    //     return age;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }
}
