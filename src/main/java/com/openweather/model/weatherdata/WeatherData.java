package com.openweather.model.weatherdata;

import com.openweather.model.weatherdata.weatherdatainfo.Forecast;
import com.openweather.model.weatherdata.weatherdatainfo.Location;
import com.openweather.model.weatherdata.weatherdatainfo.Meta;
import com.openweather.model.weatherdata.weatherdatainfo.Sun;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "weatherdata")
@Data
public class WeatherData {

    private Location location;
    private String credit;
    private Meta meta;
    private Sun sun;
    private Forecast forecast;
}
