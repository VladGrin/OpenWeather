package com.openweather.model.openweather.characteristic;

import lombok.Data;

@Data
public class Main {

    private Double temp;
    private Integer pressure;
    private Integer humidity;
    private Double temp_min;
    private Double temp_max;

}
