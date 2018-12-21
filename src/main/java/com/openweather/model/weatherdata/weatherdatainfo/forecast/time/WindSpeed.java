package com.openweather.model.weatherdata.weatherdatainfo.forecast.time;

import javax.xml.bind.annotation.XmlAttribute;

public class WindSpeed {

    private Double mps;
    private String name;

    public Double getMps() {
        return mps;
    }

    @XmlAttribute
    public void setMps(Double mps) {
        this.mps = mps;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }
}
