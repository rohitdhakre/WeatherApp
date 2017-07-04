package com.dhakre.rohit.clients.entities;

public class WeatherDetails {

	int cod;
	float message;
	int cnt;
	List[] list;
	City city;

	public WeatherDetails() {
		super();
	}

	public WeatherDetails(int cod, float message, int cnt, List[] list, City city) {
		super();
		this.cod = cod;
		this.message = message;
		this.cnt = cnt;
		this.list = list;
		this.city = city;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public float getMessage() {
		return message;
	}

	public void setMessage(float message) {
		this.message = message;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public List[] getList() {
		return list;
	}

	public void setList(List[] list) {
		this.list = list;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
