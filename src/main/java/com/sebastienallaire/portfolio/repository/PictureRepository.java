package com.sebastienallaire.portfolio.repository;

import com.sebastienallaire.portfolio.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}