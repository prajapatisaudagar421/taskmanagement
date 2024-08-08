package com.example.taskmanagement.text;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices{
    @Autowired
    private UserRepository userRepository;

    public List<User> getALLUsers(){
            return userRepository.findAll();
    }
    public User getUserByid(Long id){
        return userRepository.findById(id).orElse(null);
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
