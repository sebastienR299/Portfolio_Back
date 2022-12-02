package com.sebastienallaire.portfolio.repository;

import com.sebastienallaire.portfolio.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}