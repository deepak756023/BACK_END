package com.project.Controller;

import com.project.Service.CityService;
import com.project.Entity.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping("/cities")
	public List<City> getCities(){
		List<City> cities = cityService.getAllCities();
		return cities;
	}
	@GetMapping("/city")
	public City getCityById(@RequestParam String name) {
		City city = cityService.findCityByName(name);
		return city;
	}
	
	@GetMapping("/city-id")
	public City getCityById(@RequestParam Integer id) {
		City city = cityService.findCityById(id);
		return city;
	}
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/count-city")
	public int countCity() {
	    int count = cityService.countCities();
	    return count;
	}
	

}
