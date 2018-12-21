package com.openweather.controller;

import com.openweather.model.weatherdata.WeatherData;
import com.openweather.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.bind.JAXBException;
import java.util.Map;

@Controller
public class WeatherDataController {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/weatherdata")
    public String getOpenWeather(Map<String, Object> model) {
        WeatherData weatherData = null;
        try {
            weatherData = weatherDataService.getWeatherData();
        } catch (JAXBException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
        model.put("weatherdata", weatherData);
        return "weatherdata";
    }
}
