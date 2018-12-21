
package com.openweather.model.openweather;

import com.openweather.model.openweather.characteristic.*;
import lombok.Data;

import java.util.List;

@Data
public class OpenWeather {

    private Coord coord;
    private List<Weather> weather = null;
    private String base;
    private Main main;
    private Integer visibility;
    private Wind wind;
    private Clouds clouds;
    private Integer dt;
    private Sys sys;
    private Integer id;
    private String name;
    private Integer cod;
}
