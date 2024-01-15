package com.example.demo1.Domain;

public class cityAreas {
    private long id;
<<<<<<< HEAD
    private String areaName;
    private long numberStation;
    private String streetName;

=======
    private String nameArea;
    private long numberStations;
    private String streetName;


>>>>>>> fb643a0 (first project 1)
    @Override
    public String toString() {
        return "cityAreas{" +
                "id=" + id +
<<<<<<< HEAD
                ", areaName='" + areaName + '\'' +
                ", numberStation=" + numberStation +
=======
                ", nameArea='" + nameArea + '\'' +
                ", numberStations=" + numberStations +
>>>>>>> fb643a0 (first project 1)
                ", streetName='" + streetName + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

<<<<<<< HEAD
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
=======
    public String getNameArea() {
        return nameArea;
    }

    public void setNameArea(String nameArea) {
        this.nameArea = nameArea;
    }

    public long getNumberStations() {
        return numberStations;
    }

    public void setNumberStations(long numberStations) {
        this.numberStations = numberStations;
>>>>>>> fb643a0 (first project 1)
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
