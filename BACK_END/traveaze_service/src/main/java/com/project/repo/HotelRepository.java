package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.Entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer>{
	public Hotel findByHotelId(int id);
	
	public Hotel findByName(String name);


}