package com.openweather.model.weatherdata.weatherdatainfo.forecast.time;

import javax.xml.bind.annotation.XmlAttribute;

public class Temperature {

    private Double day;
    private Double min;
    private Double max;
    private Double night;
    private Double eve;
    private Double morn;

    public Double getDay() {
        return day;
    }

    @XmlAttribute
    public void setDay(Double day) {
        this.day = day;
    }

    public Double getMin() {
        return min;
    }

    @XmlAttribute
    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    @XmlAttribute
    public void setMax(Double max) {
        this.max = max;
    }

    public Double getNight() {
        return night;
    }

    @XmlAttribute
    public void setNight(Double night) {
        this.night = night;
    }

    public Double getEve() {
        return eve;
    }

    @XmlAttribute
    public void setEve(Double eve) {
        this.eve = eve;
    }

    public Double getMorn() {
        return morn;
    }

    @XmlAttribute
    public void setMorn(Double morn) {
        this.morn = morn;
    }
}
