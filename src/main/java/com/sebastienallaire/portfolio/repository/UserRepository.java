package com.sebastienallaire.portfolio.repository;

import com.sebastienallaire.portfolio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}