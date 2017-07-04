package com.dhakre.rohit.clients.entities;

public class Wind {

	float speed;
	float deg;

	public Wind() {
		super();
	}

	public Wind(float speed, float deg) {
		super();
		this.speed = speed;
		this.deg = deg;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getDeg() {
		return deg;
	}

	public void setDeg(float deg) {
		this.deg = deg;
	}

}
