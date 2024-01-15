package com.example.demo1.Domain;

public class cityAreas {
    private long id;
    private String areaName;
    private long numberStation;
    private String streetName;

    @Override
    public String toString() {
        return "cityAreas{" +
                "id=" + id +
                ", areaName='" + areaName + '\'' +
                ", numberStation=" + numberStation +
                ", streetName='" + streetName + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public long getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(long numberStation) {
        this.numberStation = numberStation;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
