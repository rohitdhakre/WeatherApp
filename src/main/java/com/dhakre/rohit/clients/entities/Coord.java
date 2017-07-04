package com.dhakre.rohit.clients.entities;

public class Coord {

	float lat;
	float lon;

	public Coord() {
		super();
	}

	public Coord(float lat, float lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public float getLon() {
		return lon;
	}

	public void setLon(float lon) {
		this.lon = lon;
	}

}
