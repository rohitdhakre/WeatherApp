package com.dhakre.rohit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhakre.rohit.responses.WeatherResponse;
import com.dhakre.rohit.services.IWeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	@Qualifier("weather")
	private IWeatherService service;

	@RequestMapping(value = "/api", method = RequestMethod.GET)
	public WeatherResponse getAPI() {
		return service.getResponse();
	}

}
