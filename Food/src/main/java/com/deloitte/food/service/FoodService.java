package com.deloitte.food.service;

import java.util.List;

import com.deloitte.food.entity.Food;


public interface FoodService {

	public List<Food> getAllFood();
	
	public List<Food> getFoodByPantryId(Integer pantryId);
	
	public Food addFoodItem(Food food);
	
	public void deleteFoodByFoodId(Integer foodId);
}
