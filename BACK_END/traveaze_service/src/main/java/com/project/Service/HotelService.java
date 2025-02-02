package com.project.Service;

import com.project.Entity.Hotel;
import com.project.repo.HotelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	public List<Hotel> getAllHotels(){
		return this.hotelRepository.findAll();
	}
	
	public Hotel findHotelByName(String name) {
		return this.hotelRepository.findByName(name);
	}

	
	public Hotel findHotelId(int id) {
		return this.hotelRepository.findByHotelId(id);
	}

}