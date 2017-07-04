package com.dhakre.rohit.dao.impl;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dhakre.rohit.clients.IWeatherClient;
import com.dhakre.rohit.clients.entities.List;
import com.dhakre.rohit.clients.entities.Main;
import com.dhakre.rohit.clients.entities.WeatherDetails;
import com.dhakre.rohit.dao.IWeatherDao;
import com.dhakre.rohit.entities.WeatherEntity;
import com.dhakre.rohit.repository.IWeatherRepository;

@Component
public class WeatherDao implements IWeatherDao {

	@Autowired
	private IWeatherClient weatherClient;

	@Autowired
	private IWeatherRepository weatherRepo;

	@Override
	public ArrayList<WeatherEntity> getData() {
		WeatherEntity entity;
		WeatherDetails details = weatherClient.fetchData();
		List[] list = details.getList();
		ArrayList<WeatherEntity> weatherList = new ArrayList<>();
		for (int i = 0; i < list.length; i++) {
			Main main = list[i].getMain();
			entity = new WeatherEntity(0, new Date(list[i].getDt().getTime()), main.getTemp(), main.getTemp_min(),
					main.getTemp_max());
			weatherList.add(entity);
		}
		weatherRepo.save(weatherList);
		return weatherList;
	}

}
