package com.project.repo;
import java.util.List;

import com.project.Entity.FamousPlace;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FamousPlaceRepository extends JpaRepository<FamousPlace, Integer>{
	public FamousPlace findByPlaceId(int id);
	
	public FamousPlace findByName(String name);
	
	 List<FamousPlace> findByCity_CityId(int cityId); 


}
