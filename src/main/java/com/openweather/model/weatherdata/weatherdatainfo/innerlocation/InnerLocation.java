package com.openweather.model.weatherdata.weatherdatainfo.innerlocation;

import javax.xml.bind.annotation.XmlAttribute;

public class InnerLocation {

    private Integer altitude;
    private Double latitude;
    private Double longitude;
    private String geobase;
    private Long geobaseid;

    public Integer getAltitude() {
        return altitude;
    }

    @XmlAttribute
    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    @XmlAttribute
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @XmlAttribute
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getGeobase() {
        return geobase;
    }

    @XmlAttribute
    public void setGeobase(String geobase) {
        this.geobase = geobase;
    }

    public Long getGeobaseid() {
        return geobaseid;
    }

    @XmlAttribute
    public void setGeobaseid(Long geobaseid) {
        this.geobaseid = geobaseid;
    }
}
