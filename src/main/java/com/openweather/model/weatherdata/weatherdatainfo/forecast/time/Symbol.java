package com.openweather.model.weatherdata.weatherdatainfo.forecast.time;

import javax.xml.bind.annotation.XmlAttribute;

public class Symbol {

    private int number;
    private String name;
    private String var;

    public int getNumber() {
        return number;
    }

    @XmlAttribute
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public String getVar() {
        return var;
    }

    @XmlAttribute
    public void setVar(String var) {
        this.var = var;
    }
}
