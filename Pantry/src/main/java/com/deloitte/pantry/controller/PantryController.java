package com.deloitte.pantry.controller;

import java.util.ArrayList;
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
import org.springframework.web.client.RestTemplate;

import com.deloitte.pantry.entity.Pantry;
import com.deloitte.pantry.model.Food;
import com.deloitte.pantry.model.Response;
import com.deloitte.pantry.service.PantryService;

@RestController
@RequestMapping("/pantry")
public class PantryController {

	@Autowired
	private PantryService pantryService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Pantry>> getAllPantries(){
		List<Pantry> pantries=pantryService.getAllPantries();
		return new ResponseEntity<List<Pantry>>(pantries,HttpStatus.OK);
	}
	
	
	@GetMapping("/get/{code}")
	public ResponseEntity<?> getPantriesByStnCode(@PathVariable("code") Integer stnCode){
		List<Pantry> pantries=pantryService.getPantriesByStnCode(stnCode);
		List<Response> responses=new ArrayList<>();
		
		for(Pantry pantry:pantries) {
			List<Food> foods=restTemplate.getForObject("http://localhost:8084/food/get/"+pantry.getPantryId(), List.class);
		
			Response response=new Response(pantry, foods);
			responses.add(response);
		}
		
		
		
		
		return new ResponseEntity<List<Response>>(responses, HttpStatus.OK);
//		return new ResponseEntity<List<Pantry>>(pantries,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public Pantry addPantry(@RequestBody Pantry pantry) {
		return pantryService.addPantry(pantry);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletePantryById(@PathVariable("id") Integer pantryId) {
		
		pantryService.deletePantryById(pantryId);
		
	}
	
//	public List<Food> getFoods(Integer pantryId){
//		
//		return foods;
//	}
}
