package com.project.Controller;

import com.project.Service.FamousPlaceService;
import com.project.Entity.City;
import com.project.Entity.FamousPlace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FamousPlaceController {
	
	@Autowired
	private FamousPlaceService placeService;
	
	@GetMapping("/famous_places")
	public List<FamousPlace> getPlaces(){
		List<FamousPlace> places = placeService.getAllPlaces();
		return places;
	}
	
	@GetMapping("/place")
	public FamousPlace getFamousPlaceById(@RequestParam String name) {
			FamousPlace place = placeService.findPlaceByName(name);
			return place;
		}
	
	@GetMapping("/place_id")
	public FamousPlace getFamousPlaceById(@RequestParam Integer id) {
			FamousPlace place = placeService.findPlaceById(id);
			return place;
		}

}
