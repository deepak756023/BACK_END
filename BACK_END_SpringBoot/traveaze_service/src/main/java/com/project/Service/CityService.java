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
	
	public City findCityByName(String name) {
		return this.cityRepository.findByName(name);
	}
	
	public City findCityById(int id) {
		return this.cityRepository.findByCityId(id);
	}
	
	public int countCities() {
		var count = this.cityRepository.findAll().stream().count();
		return (int)count;
	}
}
