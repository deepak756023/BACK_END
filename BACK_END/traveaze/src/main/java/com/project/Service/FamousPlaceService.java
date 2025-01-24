package com.project.Service;

import com.project.Entity.FamousPlace;
import com.project.repo.FamousPlaceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamousPlaceService {
	
	@Autowired
	private FamousPlaceRepository placeRepository;
	
	public List<FamousPlace> getAllPlaces(){
		return this.placeRepository.findAll();
	}
	
	public FamousPlace findPlaceByName(String name) {
		return this.placeRepository.findByName(name);
	}
	
	public FamousPlace findPlaceById(int id) {
		return this.placeRepository.findByPlaceId(id);
	}

}
