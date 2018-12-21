package com.openweather.controller;

import com.openweather.model.openweather.OpenWeather;
import com.openweather.service.OpenWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Map;

@Controller
public class OpenWeatherController {

    @Autowired
    private OpenWeatherService openWeatherService;

    @GetMapping
    public String getStartPage() {
        return "index";
    }


    @GetMapping("/openweather")
    public String getOpenWeather(Map<String, Object> model) {
        OpenWeather openWeather = null;
        try {
            openWeather = openWeatherService.getOpenWeather();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        model.put("openweather", openWeather);
        return "openweather";
    }
}
