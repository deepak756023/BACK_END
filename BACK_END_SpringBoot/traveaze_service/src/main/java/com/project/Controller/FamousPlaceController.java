package com.project.Controller;

import com.project.Service.FamousPlaceService;
import com.project.Entity.City;
import com.project.Entity.FamousPlace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FamousPlaceController {

	@Autowired
	private FamousPlaceService placeService;

	@GetMapping("/famous_places")
	public List<FamousPlace> getPlaces() {
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

	@GetMapping("/places_by_city")
	public List<FamousPlace> getPlacesByCityId(@RequestParam int cityId) {
		return placeService.findPlacesByCityId(cityId);
	}

	@PostMapping("/add-place")
	public void savePlace(@RequestBody FamousPlace place) {
		this.placeService.addPlace(place);
	}

	@DeleteMapping("/place")
	public void removePlace(@RequestParam String name) {
		placeService.deletePlace(name);
	}

	 @PutMapping("/place/{placeId}")
	    public ResponseEntity<FamousPlace> updatePlace(@PathVariable Integer placeId, @RequestBody FamousPlace updatedPlace) {
	        Optional<FamousPlace> updated = placeService.updatePlace(placeId, updatedPlace);
	        return updated.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }
}
