package com.example.examportalusingspringboot;

import com.example.examportalusingspringboot.model.Role;
import com.example.examportalusingspringboot.model.User;
import com.example.examportalusingspringboot.model.UserRole;
import com.example.examportalusingspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.UnknownServiceException;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamPortalUsingSpringBootApplication implements CommandLineRunner {
    @Autowired
    private UserService userService;
    public static void main(String[] args) {

        SpringApplication.run(ExamPortalUsingSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting code");
      /*  User user = new User();
        user.setFirstName("Daniel");
        user.setLastName("Vairagar");
        user.setUsername("daniel007");
        user.setPassword("abc");
        user.setEmail("dani@gmail.com");
        user.setProfile("default.png");

        Role role1 = new Role();
        role1.setRoleId(001L);
        role1.setRoleName("Admin");

        Set<UserRole> userRoleSet = new HashSet<>();
        UserRole userRole = new UserRole();
        userRole.setRole(role1);
        userRole.setUser(user);
        userRoleSet.add(userRole);

        User user1 = this.userService.createUser(user,userRoleSet);
        System.out.println(user1.getUsername());*/
    }
}
