package com.project.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tourist_plc_mstr")
public class FamousPlace {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "place_id")
	private int placeId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "history")
	private String history;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@OneToMany(mappedBy = "place", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Guide> guides = new ArrayList<>();

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
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

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public FamousPlace(int placeId, String name, String image, String location, String history, City city) {
		super();
		this.placeId = placeId;
		this.name = name;
		this.image = image;
		this.location = location;
		this.history = history;
		this.city = city;
	}

	public FamousPlace() {
		super();
	}

	@Override
	public String toString() {
		return "FamousPlace [placeId=" + placeId + ", name=" + name + ", image=" + image + ", location=" + location
				+ ", history=" + history + ", city=" + city + "]";
	}
	 
	
	

}
