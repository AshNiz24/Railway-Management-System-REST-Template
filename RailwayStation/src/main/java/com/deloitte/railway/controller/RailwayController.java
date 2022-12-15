package com.deloitte.railway.controller;

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

import com.deloitte.railway.entity.RailwayStation;
//import com.deloitte.railway.model.FailureResponse;
import com.deloitte.railway.model.Pantry;
import com.deloitte.railway.model.Response;
import com.deloitte.railway.model.Train;
import com.deloitte.railway.service.RailwayService;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/railway")
public class RailwayController {

	@Autowired
	private RailwayService railwayService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getAllStations")
	public ResponseEntity<List<RailwayStation>> getAllStations(){
		List<RailwayStation> stations=railwayService.getAllStations();
		
		return new ResponseEntity<List<RailwayStation>>(stations,HttpStatus.OK);
	}
	
	@GetMapping("/getStation/{id}")
//	@HystrixCommand(fallbackMethod = "failureFallBack")
	public ResponseEntity<?> getStationByCode(@PathVariable("id") Integer stationCode){
		RailwayStation stations=railwayService.getStationByCode(stationCode);
		List<Pantry> pantries=restTemplate.getForObject("http://localhost:8082/pantry/get/"+stationCode, List.class);
		List<Train> trains=restTemplate.getForObject("http://localhost:8083/train/getTrains/"+stationCode, List.class);
		Response response=new Response(stations, pantries,trains);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	@PostMapping("/addstation")
	public RailwayStation addStation(@RequestBody RailwayStation station)
	{
		return railwayService.addStation(station);
	}
	
	@DeleteMapping("/deletestation/{id}")
	public void deleteStation(@PathVariable("id") Integer id)
	{
		railwayService.deleteStationByCode(id);
		System.out.println("Station with station id "+id+" has been removed from database");
	}
	
	
//	public ResponseEntity<?> failureFallBack(@PathVariable("id") Integer stationCode){
//		RailwayStation stations=railwayService.getStationByCode(stationCode);
//		
//		FailureResponse response=new FailureResponse(stations, "Sorry Pantry Service not available", "Sorry Train Service not available");
//		return new ResponseEntity<FailureResponse>(response,HttpStatus.OK);
//	}
}
