package com.deloitte.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.food.entity.Food;
import com.deloitte.food.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {

	@Autowired
	private FoodService foodService;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Food>> getAllFood(){
		List<Food> foods=foodService.getAllFood();
		return new ResponseEntity<List<Food>>(foods,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<List<Food>> getFoodByPantryId(@PathVariable("id") Integer pantryId){
		List<Food> foods=foodService.getFoodByPantryId(pantryId);
		return new ResponseEntity<List<Food>>(foods,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public Food addFoodItem(@RequestBody Food food){
		
		return foodService.addFoodItem(food);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteFood(@PathVariable("id") Integer id) {
		foodService.deleteFoodByFoodId(id);
	}
}
