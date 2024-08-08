package com.example.taskmanagement.text;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Controllers  {

    @Autowired
    private UserServices userServices;
    @GetMapping

    public List<User> getAllUsers(){
        return userServices.getALLUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userServices.getUserByid(id);
    }
    @PostMapping
    public User creatUser(@RequestBody User user){
        return userServices.saveUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userServices.deleteUser(id);
    }
   
    

}
