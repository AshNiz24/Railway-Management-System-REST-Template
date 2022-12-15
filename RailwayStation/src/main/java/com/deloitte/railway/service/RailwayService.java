package com.deloitte.railway.service;

import java.util.List;

import com.deloitte.railway.entity.RailwayStation;

public interface RailwayService {
	
	public List<RailwayStation> getAllStations();
	
	public RailwayStation getStationByCode(Integer id);
	
	public RailwayStation addStation(RailwayStation station);
	
	public void deleteStationByCode(Integer id);

}
