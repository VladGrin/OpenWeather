package com.openweather.model.weatherdata.weatherdatainfo.forecast.time;

import javax.xml.bind.annotation.XmlAttribute;

public class Clouds {

    private String value;
    private Integer all;
    private String unit;

    public String getValue() {
        return value;
    }

    @XmlAttribute
    public void setValue(String value) {
        this.value = value;
    }

    public Integer getAll() {
        return all;
    }

    @XmlAttribute
    public void setAll(Integer all) {
        this.all = all;
    }

    public String getUnit() {
        return unit;
    }

    @XmlAttribute
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
