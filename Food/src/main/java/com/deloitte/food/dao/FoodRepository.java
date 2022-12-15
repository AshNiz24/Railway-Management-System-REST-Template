package com.deloitte.food.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.food.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer>{

	List<Food> findByPantryId(Integer pantryId);
}
