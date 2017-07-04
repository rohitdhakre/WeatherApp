package com.dhakre.rohit.clients.entities;

import java.util.Date;

public class List {

	Date dt;
	Main main;
	Weather[] weather;
	Clouds clouds;
	Wind wind;
	Rain rain;
	Snow snow;
	Sys sys;
	String dt_txt;

	public List() {
		super();
	}

	public List(Date dt, Main main, Weather[] weather, Clouds clouds, Wind wind, Rain rain, Snow snow, Sys sys,
			String dt_txt) {
		super();
		this.dt = dt;
		this.main = main;
		this.weather = weather;
		this.clouds = clouds;
		this.wind = wind;
		this.rain = rain;
		this.snow = snow;
		this.sys = sys;
		this.dt_txt = dt_txt;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Rain getRain() {
		return rain;
	}

	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public Snow getSnow() {
		return snow;
	}

	public void setSnow(Snow snow) {
		this.snow = snow;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public String getDt_txt() {
		return dt_txt;
	}

	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}

}
