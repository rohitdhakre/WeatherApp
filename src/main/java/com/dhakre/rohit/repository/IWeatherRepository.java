package com.dhakre.rohit.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhakre.rohit.entities.WeatherEntity;

@Transactional
@Repository
public interface IWeatherRepository extends CrudRepository<WeatherEntity, Integer> {

}