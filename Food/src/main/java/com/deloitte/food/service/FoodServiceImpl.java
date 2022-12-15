package com.deloitte.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.food.dao.FoodRepository;
import com.deloitte.food.entity.Food;

@Service
public class FoodServiceImpl implements FoodService{
	
	@Autowired
	private FoodRepository foodRepository;

	@Override
	public List<Food> getAllFood() {
		// TODO Auto-generated method stub
		return foodRepository.findAll();
	}

	@Override
	public List<Food> getFoodByPantryId(Integer pantryId) {
		// TODO Auto-generated method stub
		return foodRepository.findByPantryId(pantryId);
	}

	@Override
	public Food addFoodItem(Food food) {
		// TODO Auto-generated method stub
		return foodRepository.save(food);
	}

	@Override
	public void deleteFoodByFoodId(Integer foodId) {
		// TODO Auto-generated method stub
		foodRepository.deleteById(foodId);
		System.out.println("Food with id "+foodId+" is unavailable at the moment");
	}

}
