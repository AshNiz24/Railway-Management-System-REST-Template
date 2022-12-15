package com.deloitte.railway.model;

import java.util.List;

import com.deloitte.railway.entity.*;
public class Response {

	private RailwayStation railway;
	private List<Pantry> pantries;
	private List<Train> trains;
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(RailwayStation railway
			, List<Pantry> pantries
			, List<Train> trains
			) {
		super();
		this.railway = railway;
		this.pantries = pantries;
		this.trains = trains;
	}

	public RailwayStation getRailway() {
		return railway;
	}

	public void setRailway(RailwayStation railway) {
		this.railway = railway;
	}

	public List<Pantry> getPantries() {
		return pantries;
	}

	public void setPantries(List<Pantry> pantries) {
		this.pantries = pantries;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	
	
	
	
	
}
