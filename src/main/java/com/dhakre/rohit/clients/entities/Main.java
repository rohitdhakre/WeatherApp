package com.dhakre.rohit.clients.entities;

public class Main {

	float temp;
	float temp_min;
	float temp_max;
	float pressure;
	float sea_level;
	float grnd_level;
	int humidity;
	float temp_kf;

	public Main() {
		super();
	}

	public Main(float temp, float temp_min, float temp_max, float pressure, float sea_level, float grnd_level,
			int humidity, float temp_kf) {
		super();
		this.temp = temp;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.sea_level = sea_level;
		this.grnd_level = grnd_level;
		this.humidity = humidity;
		this.temp_kf = temp_kf;
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

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getSea_level() {
		return sea_level;
	}

	public void setSea_level(float sea_level) {
		this.sea_level = sea_level;
	}

	public float getGrnd_level() {
		return grnd_level;
	}

	public void setGrnd_level(float grnd_level) {
		this.grnd_level = grnd_level;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public float getTemp_kf() {
		return temp_kf;
	}

	public void setTemp_kf(float temp_kf) {
		this.temp_kf = temp_kf;
	}

}
