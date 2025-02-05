package com.project.Service;

import com.project.repo.CityRepository;

import com.project.Entity.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;

	public List<City> getAllCities() {
		return this.cityRepository.findAll();
	}

	public List<String> getCitiesNames(String state) {
		return this.cityRepository.findAll().stream().filter(city -> city.getState().equals(state))
				.map(city -> city.getName()).collect(Collectors.toList());
	}

	public City findCityByName(String name) {
		return this.cityRepository.findByName(name);
	}

	public City findCityById(int id) {
		return this.cityRepository.findByCityId(id);
	}

	public int countCities() {
		var count = this.cityRepository.findAll().stream().count();
		return (int) count;
	}

	public void addCity(City c) {
		this.cityRepository.save(c);
	}
}
