package com.openweather.model.openweather.characteristic;

import lombok.Data;

@Data
public class Weather {

    private Integer id;
    private String main;
    private String description;
    private String icon;
}
