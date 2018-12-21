package com.openweather.model.weatherdata.weatherdatainfo.forecast.time;

import javax.xml.bind.annotation.XmlAttribute;

public class Precipitation {

    private Double value;
    private String type;

    public Double getValue() {
        return value;
    }

    @XmlAttribute
    public void setValue(Double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }
}
