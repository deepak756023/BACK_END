package com.project.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "hotels")
public class Hotel {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hotel_id")
	private int hotelId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "is_available")
	private String isAvailable;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Hotel(int hotelId, String name, String image, String location, String isAvailable, City city) {
		super();
		this.hotelId = hotelId;
		this.name = name;
		this.image = image;
		this.location = location;
		this.isAvailable = isAvailable;
		this.city = city;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", name=" + name + ", image=" + image + ", location=" + location
				+ ", isAvailable=" + isAvailable + ", city=" + city + "]";
	}
	
	
	

}
