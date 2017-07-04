package com.dhakre.rohit.clients.entities;

public class City {

	int id;
	String name;
	Coord coord;
	String country;

	public City() {
		super();
	}

	public City(int id, String name, Coord coord, String country) {
		super();
		this.id = id;
		this.name = name;
		this.coord = coord;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
