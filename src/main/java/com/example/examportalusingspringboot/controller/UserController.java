package com.example.examportalusingspringboot.controller;

import com.example.examportalusingspringboot.model.Role;
import com.example.examportalusingspringboot.model.User;
import com.example.examportalusingspringboot.model.UserRole;
import com.example.examportalusingspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    //creating User
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {

        Set<UserRole> roles = new HashSet<>();
        Role role = new Role();
        role.setRoleId(0001L);
        role.setRoleName("Normal");
        UserRole userRole= new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
    return this.userService.createUser(user,roles);
    }
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }
    //delete user by Id
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        this.userService.deleteUser(userId);
    }
}
