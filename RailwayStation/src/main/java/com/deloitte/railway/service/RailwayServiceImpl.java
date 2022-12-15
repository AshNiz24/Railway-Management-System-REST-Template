package com.deloitte.railway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.railway.dao.RailwayRepository;
import com.deloitte.railway.entity.RailwayStation;


@Service
public class RailwayServiceImpl implements RailwayService{
	
	@Autowired
	private RailwayRepository railwayRepository;

	@Override
	public List<RailwayStation> getAllStations() {
		// TODO Auto-generated method stub
		return railwayRepository.findAll();
	}
	@Override
	public RailwayStation getStationByCode(Integer id) {
		// TODO Auto-generated method stub
		return railwayRepository.findById(id).get();
	}

	@Override
	public RailwayStation addStation(RailwayStation station) {
		// TODO Auto-generated method stub
		return railwayRepository.save(station);
	}

	@Override
	public void deleteStationByCode(Integer id) {
		// TODO Auto-generated method stub
		railwayRepository.deleteById(id);
		
		
	}

}
