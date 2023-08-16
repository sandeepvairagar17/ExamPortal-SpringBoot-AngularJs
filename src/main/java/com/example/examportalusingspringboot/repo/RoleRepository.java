package com.example.examportalusingspringboot.repo;

import com.example.examportalusingspringboot.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
