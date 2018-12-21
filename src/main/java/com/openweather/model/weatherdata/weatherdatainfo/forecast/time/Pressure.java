package com.openweather.model.weatherdata.weatherdatainfo.forecast.time;

import javax.xml.bind.annotation.XmlAttribute;

public class Pressure {

    private String unit;
    private Double value;

    public String getUnit() {
        return unit;
    }

    @XmlAttribute
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getValue() {
        return value;
    }

    @XmlAttribute
    public void setValue(Double value) {
        this.value = value;
    }
}
