package com.deloitte.train.controller;

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

import com.deloitte.train.entity.Train;
import com.deloitte.train.service.TrainService;

@RestController
@RequestMapping("/train")
public class TrainController {
	
	@Autowired
	private TrainService trainService;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Train>> getAllTrains(){
		List<Train> trains=trainService.getAllTrains();
		return new ResponseEntity<List<Train>> (trains,HttpStatus.OK);
	}
	
	@GetMapping("/getTrains/{stnCode}")
	public ResponseEntity<List<Train>> getTrainsByStationCode(@PathVariable("stnCode") Integer stationCode){
		List<Train> trains=trainService.getTrainsByStationCode(stationCode);
		return new ResponseEntity<List<Train>> (trains,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public Train addTrain(@RequestBody Train train){
		return trainService.addTrain(train);
	}
	
	@DeleteMapping("/delete/{trainNum}")
	public void deleteByTrainNum(@PathVariable("trainNum") Integer trainNum) {
		trainService.deleteTrainById(trainNum);
	}

}
