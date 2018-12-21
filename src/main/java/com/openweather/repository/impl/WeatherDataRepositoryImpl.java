package com.openweather.repository.impl;

import com.openweather.repository.WeatherDataRepository;

import java.io.File;

public class WeatherDataRepositoryImpl implements WeatherDataRepository {

    @Override
    public File getXMLFile() {
        return new File("data.xml");
    }
}
