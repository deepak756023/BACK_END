package com.project.repo;

import com.project.Entity.City;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository  extends JpaRepository<City, Integer>{
	public City findByCityId(int id);
	public City findByName(String name);


}
