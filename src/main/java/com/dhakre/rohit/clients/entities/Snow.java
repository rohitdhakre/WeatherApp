package com.dhakre.rohit.clients.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow {

	@JsonProperty("3h")
	float _3h;

	public Snow() {
		super();
	}

	public Snow(float _3h) {
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
