package com.openweather.service.impl;

import com.google.gson.Gson;
import com.openweather.model.openweather.OpenWeather;
import com.openweather.repository.OpenWeatherRepository;
import com.openweather.repository.impl.OpenWeatherRepositoryImpl;
import com.openweather.service.OpenWeatherService;
import org.springframework.stereotype.Service;

@Service
public class OpenWeatherServiceImpl implements OpenWeatherService {

    private OpenWeatherRepository openWeatherRepository = new OpenWeatherRepositoryImpl();

    @Override
    public OpenWeather getOpenWeather() {
        Gson gson = new Gson();
        return gson.fromJson(openWeatherRepository.getOpenWeatherString(), OpenWeather.class);
    }
}
