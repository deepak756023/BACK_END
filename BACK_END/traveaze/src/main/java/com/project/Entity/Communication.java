package com.project.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "city_communications")
public class Communication {
//	@Id
//    //@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "city_id")
//	private int cityId;
	
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "com_id")
	private int comId;
	
	@Column(name = "name")
	private String name;
	
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;


//	public int getCityId() {
//		return cityId;
//	}
//
//
//	public void setCityId(int cityId) {
//		this.cityId = cityId;
//	}


	public int getComId() {
		return comId;
	}


	public void setComId(int comId) {
		this.comId = comId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	public Communication(int cityId, int comId, String name, City city) {
		super();
//		this.cityId = cityId;
		this.comId = comId;
		this.name = name;
		this.city = city;
	}


	public Communication() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Communication [ comId=" + comId + ", name=" + name + ", city=" + city + "]";
	}
    
// cityId=" + cityId + ",	
	
	

	

}

