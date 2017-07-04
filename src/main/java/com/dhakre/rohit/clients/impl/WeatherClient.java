package com.dhakre.rohit.clients.impl;

import java.io.IOException;
import java.net.URL;

import org.springframework.stereotype.Component;

import com.dhakre.rohit.clients.IWeatherClient;
import com.dhakre.rohit.clients.entities.WeatherDetails;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class WeatherClient implements IWeatherClient {

	@Override
	public WeatherDetails fetchData() {
		WeatherDetails details = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			details = mapper.readValue(
					new URL("http://samples.openweathermap.org/data/2.5/forecast?id=524901&appid=b1b15e88fa797225412429c1c50c122a1"),
					WeatherDetails.class);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return details;
	}

}
