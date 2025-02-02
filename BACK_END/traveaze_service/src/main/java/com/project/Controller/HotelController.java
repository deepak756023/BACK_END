package com.project.Controller;

import com.project.Service.HotelService;
import com.project.Entity.Hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@GetMapping("/hotels")
	public List<Hotel> getPlaces(){
		List<Hotel> hotels = hotelService.getAllHotels();
		return hotels;
	}
	
	@GetMapping("/hotel")
	public Hotel findByHotelId(@RequestParam String name) {
			Hotel place = hotelService.findHotelByName(name);
			return place;
		}
	
	@GetMapping("/hotel-id")
	public Hotel findByHotelId(@RequestParam Integer id) {
			Hotel place = hotelService.findHotelId(id);
			return place;
		}

}