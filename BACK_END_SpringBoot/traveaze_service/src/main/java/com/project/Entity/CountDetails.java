package com.project.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class CountDetails {

	@Id
	@Column(name = "type")
	private String type;

	@Column(name = "total")
	private int total;

	// Getters and Setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public CountDetails(String type, int total) {
		super();
		this.type = type;
		this.total = total;
	}

	@Override
	public String toString() {
		return "CountDetails [type=" + type + ", total=" + total + "]";
	}

	public CountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
