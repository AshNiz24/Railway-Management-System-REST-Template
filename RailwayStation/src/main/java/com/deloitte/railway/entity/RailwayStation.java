package com.deloitte.railway.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Railways")
public class RailwayStation {

	@Id
	@GeneratedValue
	private Integer stationCode;
	private String location;
	private String stationName;
	private Integer numPlatforms;
	
	public RailwayStation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RailwayStation(Integer stationCode, String location, String stationName, Integer numPlatforms) {
		super();
		this.stationCode = stationCode;
		this.location = location;
		this.stationName = stationName;
		this.numPlatforms = numPlatforms;
	}

	public Integer getStationCode() {
		return stationCode;
	}

	public void setStationCode(Integer stationCode) {
		this.stationCode = stationCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Integer getNumPlatforms() {
		return numPlatforms;
	}

	public void setNumPlatforms(Integer numPlatforms) {
		this.numPlatforms = numPlatforms;
	}
	
	
	
	
	
}
