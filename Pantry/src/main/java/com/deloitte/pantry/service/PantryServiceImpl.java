package com.deloitte.pantry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.pantry.dao.PantryRepository;
import com.deloitte.pantry.entity.Pantry;

@Service
public class PantryServiceImpl implements PantryService{
	
	@Autowired
	private PantryRepository pantryRepository;

	@Override
	public List<Pantry> getAllPantries() {
		// TODO Auto-generated method stub
		return pantryRepository.findAll();
	}

	@Override
	public List<Pantry> getPantriesByStnCode(Integer stnCode) {
		// TODO Auto-generated method stub
		return pantryRepository.findByStnCode(stnCode);
	}

	@Override
	public Pantry addPantry(Pantry pantry) {
		// TODO Auto-generated method stub
		return pantryRepository.save(pantry);
	}

	@Override
	public void deletePantryById(Integer id) {
		// TODO Auto-generated method stub
		 pantryRepository.deleteById(id);
		 System.out.println("Pantry with id "+id+" is not servicable henceforth");
	}

}
