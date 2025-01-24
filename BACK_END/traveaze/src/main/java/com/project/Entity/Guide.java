package com.project.Entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tour_guides")
public class Guide {
	
	@Id
	@Column(name = "guide_id")
	private int guideId;
	
	@Column(name = "name")
	private String name;

	
	@Column(name = "email")
	private String email;

	@Column(name = "experience")
	private int experience;
	
	@Column(name = "phone")
	private BigInteger  phone;

	@Column(name = "charges")
	private int charges;

	@ManyToOne
	@JoinColumn(name = "place_id")
	private FamousPlace place;

	public int getGuideId() {
		return guideId;
	}

	public void setGuideId(int guideId) {
		this.guideId = guideId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public FamousPlace getPlace() {
		return place;
	}

	public void setPlace(FamousPlace place) {
		this.place = place;
	}

	public Guide(int guideId, String name, String email, int experience, BigInteger phone, int charges,
			FamousPlace place) {
		super();
		this.guideId = guideId;
		this.name = name;
		this.email = email;
		this.experience = experience;
		this.phone = phone;
		this.charges = charges;
		this.place = place;
	}

	public Guide() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Guide [guideId=" + guideId + ", name=" + name + ", email=" + email + ", experience=" + experience
				+ ", phone=" + phone + ", charges=" + charges + ", place=" + place + "]";
	}
	
	
	
	

}
