package com.deloitte.train.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.train.entity.Train;

@Repository
public interface TrainRepo extends JpaRepository<Train, Integer>{

	List<Train> findByStationCode(Integer stationCode);
	
	
}
