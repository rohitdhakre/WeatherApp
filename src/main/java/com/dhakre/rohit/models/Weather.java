package com.dhakre.rohit.models;

import java.util.Date;

public class Weather {

	private int id;
	private Date dt;
	private float temp;
	private float temp_min;
	private float temp_max;

	public Weather() {
		super();
	}

	public Weather(int id, Date dt, float temp, float temp_min, float temp_max) {
		super();
		this.id = id;
		this.dt = dt;
		this.temp = temp;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(float temp_min) {
		this.temp_min = temp_min;
	}

	public float getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(float temp_max) {
		this.temp_max = temp_max;
	}

}
