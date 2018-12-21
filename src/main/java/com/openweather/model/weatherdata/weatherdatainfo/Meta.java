package com.openweather.model.weatherdata.weatherdatainfo;

import lombok.Data;

@Data
public class Meta {

    private String lastupdate;
    private Double calctime;
    private String nextupdate;

}
