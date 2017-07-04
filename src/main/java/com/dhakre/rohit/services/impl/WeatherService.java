package com.dhakre.rohit.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakre.rohit.dao.IWeatherDao;
import com.dhakre.rohit.entities.WeatherEntity;
import com.dhakre.rohit.models.Weather;
import com.dhakre.rohit.responses.WeatherResponse;
import com.dhakre.rohit.services.IWeatherService;

@Service("weather")
public class WeatherService implements IWeatherService {

	@Autowired
	private IWeatherDao weatherDao;

	@Override
	public WeatherResponse getResponse() {
		ArrayList<WeatherEntity> entity = weatherDao.getData();
		WeatherEntity[] entityArray = entity.toArray(new WeatherEntity[entity.size()]);
		Weather[] weatherArray = new Weather[entity.size()];
		for (int i = 0; i < entity.size(); i++) {
			weatherArray[i] = new Weather(entityArray[i].getId(), entityArray[i].getDt(), entityArray[i].getTemp(),
					entityArray[i].getTemp_min(), entityArray[i].getTemp_max());
		}
		WeatherResponse response = new WeatherResponse(true, "Successfully inserted in database");
		return response;
	}

}
