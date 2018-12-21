package com.openweather.model.weatherdata.weatherdatainfo.forecast.time;

import javax.xml.bind.annotation.XmlAttribute;

public class WindDirection {

    private Double deg;
    private String code;
    private String name;

    public Double getDeg() {
        return deg;
    }

    @XmlAttribute
    public void setDeg(Double deg) {
        this.deg = deg;
    }

    public String getCode() {
        return code;
    }

    @XmlAttribute
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }
}
