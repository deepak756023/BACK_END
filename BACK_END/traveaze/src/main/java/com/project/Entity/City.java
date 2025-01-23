package com.project.Entity;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "cities")

public class City {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "city_id")
	private int cityId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "state")
	private String state;
	
	
	@Column(name = "date_added")
    private Timestamp dateAdded;
	
	@OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<FamousPlace> places = new ArrayList<>();


	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Timestamp dateAdded) {
		this.dateAdded = dateAdded;
	}
	

	public City(int cityId, String name, String state, Timestamp dateAdded) {
		super();
		this.cityId = cityId;
		this.name = name;
		this.state = state;
		this.dateAdded = dateAdded;
	}

	public City() {
		super();
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", name=" + name + ", state=" + state + ", dateAdded=" + dateAdded + "]";
	}
	
	
	
	
}
