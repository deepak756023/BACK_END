package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Entity.CountDetails;

public interface CountDetailsRepository extends JpaRepository<CountDetails, String> {
    
}
