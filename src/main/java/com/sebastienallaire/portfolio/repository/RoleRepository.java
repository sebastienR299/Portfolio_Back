package com.sebastienallaire.portfolio.repository;

import com.sebastienallaire.portfolio.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}