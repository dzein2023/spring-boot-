package com.example.demo1.Domain;

public class stopStation {
   private long id;
   private String stationName;
   private String stationLocation;
   private String busDestination;

    @Override
    public String toString() {
        return "stopStation{" +
                "id=" + id +
                ", stationName='" + stationName + '\'' +
                ", stationLocation='" + stationLocation + '\'' +
                ", busDestination='" + busDestination + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getBusDestination() {
        return busDestination;
    }

    public void setBusDestination(String busDestination) {
        this.busDestination = busDestination;
    }
}
