package com.openweather.service;

import com.openweather.model.weatherdata.WeatherData;

import javax.xml.bind.JAXBException;

public interface WeatherDataService {
    WeatherData getWeatherData() throws JAXBException;
}
