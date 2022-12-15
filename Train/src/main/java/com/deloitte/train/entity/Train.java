package com.deloitte.train.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Train {

	@Id
	@GeneratedValue
	private Integer trainNum;
	
	private Integer numPassengers;
	private String status;
	private String seatAvailability;
	private Integer stationCode;
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Train(Integer trainNum, Integer numPassengers, String status, String seatAvailability, Integer stationCode
			) {
		super();
		this.trainNum = trainNum;
		this.numPassengers = numPassengers;
		this.status = status;
		this.seatAvailability = seatAvailability;
		this.stationCode=stationCode;
	}
	public Integer getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}
	public Integer getNumPassengers() {
		return numPassengers;
	}
	public void setNumPassengers(Integer numPassengers) {
		this.numPassengers = numPassengers;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSeatAvailability() {
		return seatAvailability;
	}
	public void setSeatAvailability(String seatAvailability) {
		this.seatAvailability = seatAvailability;
	}
	public Integer getStationCode() {
		return stationCode;
	}
	public void setStationCode(Integer stationCode) {
		this.stationCode = stationCode;
	}
	
	
	
	
	
	
}
