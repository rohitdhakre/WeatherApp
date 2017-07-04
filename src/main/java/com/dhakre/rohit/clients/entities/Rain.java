package com.dhakre.rohit.clients.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {

	@JsonProperty("3h")
	float _3h;

	public Rain() {
		super();
	}

	public Rain(float _3h) {
		super();
		this._3h = _3h;
	}

	public float get_3h() {
		return _3h;
	}

	public void set_3h(float _3h) {
		this._3h = _3h;
	}

}
