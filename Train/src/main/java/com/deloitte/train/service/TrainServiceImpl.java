package com.deloitte.train.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.train.dao.TrainRepo;
import com.deloitte.train.entity.Train;

@Service
public class TrainServiceImpl implements TrainService{
	
	@Autowired
	private TrainRepo trainRepo;

	@Override
	public List<Train> getAllTrains() {
		// TODO Auto-generated method stub
		return trainRepo.findAll();
	}

	@Override
	public List<Train> getTrainsByStationCode(Integer stationCode) {
		// TODO Auto-generated method stub
		return trainRepo.findByStationCode(stationCode);
	}

	@Override
	public Train addTrain(Train train) {
		// TODO Auto-generated method stub
		return trainRepo.save(train);
	}

	@Override
	public void deleteTrainById(Integer trainNum) {
		// TODO Auto-generated method stub
		trainRepo.deleteById(trainNum);
		System.out.println("Train Number "+ trainNum+ " has been cancelled");
		
	}

}
