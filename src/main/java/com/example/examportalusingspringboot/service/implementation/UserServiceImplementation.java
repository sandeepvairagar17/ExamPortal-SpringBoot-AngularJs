package com.example.examportalusingspringboot.service.implementation;

import com.example.examportalusingspringboot.model.User;
import com.example.examportalusingspringboot.model.UserRole;
import com.example.examportalusingspringboot.repo.RoleRepository;
import com.example.examportalusingspringboot.repo.UserRepository;
import com.example.examportalusingspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepository.findByUsername(user.getUsername());
        if (local != null){
            System.out.println("User is Already there !! ");
            throw new Exception("User already present");
        }else {
            for (UserRole ur:userRoles){
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);
        }
        return local;
    }

    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }
}
