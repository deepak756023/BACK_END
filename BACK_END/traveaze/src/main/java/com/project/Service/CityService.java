package com.project.Service;

import com.project.repo.CityRepository;
import com.project.Entity.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;
	
	public List<City> getAllCities(){
		return  this.cityRepository.findAll();
	}
	
	public City findCityById(int id) {
		return this.cityRepository.findByCityId(id);
	}
}
