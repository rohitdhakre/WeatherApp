package com.dhakre.rohit.responses;

import com.dhakre.rohit.models.Weather;

public class WeatherResponse extends BaseResponse {

	private Weather weather;

	public WeatherResponse(boolean successful, String message) {
		super(successful, message);
	}

	public WeatherResponse(boolean successful, String message, Weather weather) {
		super(successful, message);
		this.weather = weather;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	@Override
	public String toString() {
		return "WeatherResponse [weather=" + weather + "]";
	}

}
