package com.openweather.model.weatherdata.weatherdatainfo;

import com.openweather.model.weatherdata.weatherdatainfo.forecast.Time;
import lombok.Data;

import java.util.List;

@Data
public class Forecast {

    private List<Time> time;

}