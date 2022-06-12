package com.ie303m22.laptopweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ie303m22.laptopweb.models.EHeaderImageType;
import com.ie303m22.laptopweb.models.HeaderImage;

@Repository
public interface HeaderImageRepository extends JpaRepository<HeaderImage, Integer> {
	public List<HeaderImage> findByTypeAndEnable(EHeaderImageType type, Boolean enable);

	public List<HeaderImage> findByType(EHeaderImageType type);
}
