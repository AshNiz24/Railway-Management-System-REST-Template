package com.deloitte.pantry.service;

import java.util.List;

import com.deloitte.pantry.entity.Pantry;

public interface PantryService {

	public List<Pantry> getAllPantries();
	
	public List<Pantry> getPantriesByStnCode(Integer stnCode);
	
	
	
	public Pantry addPantry(Pantry pantry);
	
	public void deletePantryById(Integer pantryId);
	
	
}
