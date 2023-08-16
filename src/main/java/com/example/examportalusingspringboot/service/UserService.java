package com.example.examportalusingspringboot.service;

import com.example.examportalusingspringboot.model.User;
import com.example.examportalusingspringboot.model.UserRole;

import java.util.Set;

public interface UserService {
    //creating user
    public User createUser(User user, Set<UserRole> userRoles);
}
