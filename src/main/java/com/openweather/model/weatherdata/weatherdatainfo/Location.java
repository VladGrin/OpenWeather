package com.openweather.model.weatherdata.weatherdatainfo;

import com.openweather.model.weatherdata.weatherdatainfo.innerlocation.InnerLocation;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

@Data
public class Location {
    private String name;
    private String type;
    private String country;
    private String timezone;
    private InnerLocation innerLocation;

    @XmlElement(name = "location")
    public void setInnerLocation(InnerLocation innerLocation) {
        this.innerLocation = innerLocation;
    }
}
