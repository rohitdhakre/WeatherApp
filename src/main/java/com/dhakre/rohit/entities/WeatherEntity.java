package com.dhakre.rohit.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "record")
public class WeatherEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "date")
	@NotNull
	private Date dt;

	@Column(name = "temp")
	@NotNull
	private float temp;

	@Column(name = "temp_min")
	@NotNull
	private float temp_min;

	@Column(name = "temp_max")
	@NotNull
	private float temp_max;

	public WeatherEntity() {
		super();
	}

	public WeatherEntity(int id, Date dt, float temp, float temp_min, float temp_max) {
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
