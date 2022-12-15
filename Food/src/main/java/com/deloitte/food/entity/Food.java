package com.deloitte.food.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Food {

	@Id
	@GeneratedValue
	private Integer foodId;
	
	private String foodName;
	private Double price;
	private Integer pantryId;
	private Integer stnCode;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Food(Integer foodId, String foodName, Double price, Integer pantryId,Integer stnCode) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.price = price;
		this.pantryId = pantryId;
		this.stnCode=stnCode;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getPantryId() {
		return pantryId;
	}

	public void setPantryId(Integer pantryId) {
		this.pantryId = pantryId;
	}

	public Integer getStnCode() {
		return stnCode;
	}

	public void setStnCode(Integer stnCode) {
		this.stnCode = stnCode;
	}
	
	
	
	
	
}
