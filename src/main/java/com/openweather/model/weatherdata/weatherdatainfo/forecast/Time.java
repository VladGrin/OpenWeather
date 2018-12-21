package com.openweather.model.weatherdata.weatherdatainfo.forecast;

import com.openweather.model.weatherdata.weatherdatainfo.forecast.time.*;
import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;

@Data
public class Time {
    private String day;
    private Symbol symbol;
    private Precipitation precipitation;
    private WindDirection windDirection;
    private WindSpeed windSpeed;
    private Temperature temperature;
    private Pressure pressure;
    private Humidity humidity;
    private Clouds clouds;

    @XmlAttribute
    public void setDay(String day) {
        this.day = day;
    }
}
