package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.Entity.Communication;
import java.util.*;

public interface CommunicationRepository extends JpaRepository<Communication, Integer> {
	//public Communication findByComId(int id);
	
	@Query("SELECT c.name FROM Communication c WHERE c.city.cityId = :cityId")
    List<String> findNameByCityId(@Param("cityId") int cityId);
	
}
	