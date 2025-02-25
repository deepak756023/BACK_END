package com.project.Service;

import com.project.Entity.FamousPlace;
import com.project.repo.FamousPlaceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamousPlaceService {

	@Autowired
	private FamousPlaceRepository placeRepository;

	public List<FamousPlace> getAllPlaces() {
		return this.placeRepository.findAll();
	}

	public FamousPlace findPlaceByName(String name) {
		return this.placeRepository.findByName(name);
	}

	public FamousPlace findPlaceById(int id) {
		return this.placeRepository.findByPlaceId(id);
	}

	public List<FamousPlace> findPlacesByCityId(int cityId) {
		return placeRepository.findByCity_CityId(cityId);
	}

	public void addPlace(FamousPlace place) {
		this.placeRepository.save(place);
	}

	public void deletePlace(String name) {
		this.placeRepository.deletePlaceByName(name);
	}
	
	public Optional<FamousPlace> updatePlace(Integer placeId, FamousPlace updatedPlace) {
        return placeRepository.findById(placeId).map(existingPlace -> {
            existingPlace.setName(updatedPlace.getName());
            existingPlace.setImage(updatedPlace.getImage());
            existingPlace.setLocation(updatedPlace.getLocation());
            existingPlace.setHistory(updatedPlace.getHistory());
            existingPlace.setCity(updatedPlace.getCity());
            return placeRepository.save(existingPlace);
        });
    }

}
