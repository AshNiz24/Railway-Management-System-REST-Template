package com.deloitte.train.service;

import java.util.List;

import com.deloitte.train.entity.Train;

public interface TrainService {

	public List<Train> getAllTrains();
	
	public List<Train> getTrainsByStationCode(Integer stationCode);
	
	public Train addTrain(Train train);
	
	public void deleteTrainById(Integer trainNum);
}
