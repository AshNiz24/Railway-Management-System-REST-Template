package com.deloitte.pantry.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Pantry {

	@Id
	@GeneratedValue
	private Integer pantryId;
	
	
	private Integer stnCode;
	
	private String time;
	private String pantryName;
	
	
	public Pantry() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pantry(Integer stnCode, String time, String pantryName) {
		super();
		this.stnCode = stnCode;
		this.time = time;
		this.pantryName = pantryName;
	}


	public Integer getStnCode() {
		return stnCode;
	}


	public void setStnCode(Integer stnCode) {
		this.stnCode = stnCode;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getPantryName() {
		return pantryName;
	}


	public void setPantryName(String pantryName) {
		this.pantryName = pantryName;
	}


	public Integer getPantryId() {
		return pantryId;
	}


	
	
	
	
	
	
	
}
