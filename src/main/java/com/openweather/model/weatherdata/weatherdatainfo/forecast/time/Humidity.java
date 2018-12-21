package com.openweather.model.weatherdata.weatherdatainfo.forecast.time;

import javax.xml.bind.annotation.XmlAttribute;

public class Humidity {

    private Integer value;
    private String unit;

    public Integer getValue() {
        return value;
    }

    @XmlAttribute
    public void setValue(Integer value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    @XmlAttribute
    public void setUnit(String unit) {
        this.unit = unit;
    }
}