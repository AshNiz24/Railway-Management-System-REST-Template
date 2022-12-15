package com.deloitte.railway.model;

import com.deloitte.railway.entity.RailwayStation;

public class FailureResponse {
private RailwayStation railwayStation;
private String msg1;
private String msg2;
public FailureResponse() {
	super();
	// TODO Auto-generated constructor stub
}
public FailureResponse(RailwayStation railwayStation, String msg1, String msg2) {
	super();
	this.railwayStation = railwayStation;
	this.msg1 = msg1;
	this.msg2 = msg2;
}
public RailwayStation getRailwayStation() {
	return railwayStation;
}
public void setRailwayStation(RailwayStation railwayStation) {
	this.railwayStation = railwayStation;
}
public String getMsg1() {
	return msg1;
}
public void setMsg1(String msg1) {
	this.msg1 = msg1;
}
public String getMsg2() {
	return msg2;
}
public void setMsg2(String msg2) {
	this.msg2 = msg2;
}


}
