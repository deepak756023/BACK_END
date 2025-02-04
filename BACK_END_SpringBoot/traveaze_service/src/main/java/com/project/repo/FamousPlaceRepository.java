package com.project.repo;

import java.util.List;

import javax.transaction.Transactional;

import com.project.Entity.FamousPlace;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional

public interface FamousPlaceRepository extends JpaRepository<FamousPlace, Integer> {
	public FamousPlace findByPlaceId(int id);

	public FamousPlace findByName(String name);

	

	List<FamousPlace> findByCity_CityId(int cityId);

	

	public void deletePlaceByName(String name);

}
