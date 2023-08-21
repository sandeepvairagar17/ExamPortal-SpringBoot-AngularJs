package com.example.examportalusingspringboot.repo;

import com.example.examportalusingspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUsername(String name);
}
