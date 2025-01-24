package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Entity.Guide;

@Repository
public interface GuideRepository extends JpaRepository<Guide, Integer> {
	public Guide findByName(String name);
}
