package com.openweather.service;

import com.openweather.model.openweather.OpenWeather;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface OpenWeatherService {
    OpenWeather getOpenWeather() throws ParserConfigurationException, IOException, SAXException;
}
