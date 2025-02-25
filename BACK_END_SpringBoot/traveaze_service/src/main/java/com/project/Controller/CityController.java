package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.City;
import com.project.Service.CityService;

@RestController
public class CityController {

	@Autowired
	private CityService cityService;

	@GetMapping("/cities")
	public List<City> getCities() {
		List<City> cities = cityService.getAllCities();
		return cities;
	}

	@GetMapping("/cities_name")
	public List<String> getCitiesName(@RequestParam String state) {
		List<String> cities = cityService.getCitiesNames(state);
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

	@GetMapping("/count-city")
	public int countCity() {
		int count = cityService.countCities();
		return count;
	}

	@PostMapping("/add-city")
	public void saveCity(@RequestBody City city) {
		cityService.addCity(city);

	}
	
	

}
