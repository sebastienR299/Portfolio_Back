package com.sebastienallaire.portfolio.repository;

import com.sebastienallaire.portfolio.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}