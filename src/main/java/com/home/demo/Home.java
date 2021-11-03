package com.home.demo;

import java.util.ArrayList;
import java.util.List;

public class Home {
	
	private int id;
	private String type;
	private int yearBuilt;
	private List<Device> devices;
	
	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public Home() {}

	public Home(int id, String type, int yearBuilt) {
		super();
		this.id = id;
		this.type = type;
		this.yearBuilt = yearBuilt;
		this.devices = new ArrayList<>();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	
}
