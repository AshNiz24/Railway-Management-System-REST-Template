package com.deloitte.pantry.model;

import java.util.List;

import com.deloitte.pantry.entity.Pantry;

public class Response {

	private Pantry pantry;
	private List<Food> foods;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(Pantry pantry, List<Food> foods) {
		super();
		this.pantry = pantry;
		this.foods = foods;
	}
	public Pantry getPantry() {
		return pantry;
	}
	public void setPantry(Pantry pantry) {
		this.pantry = pantry;
	}
	public List<Food> getFoods() {
		return foods;
	}
	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
	
	
}