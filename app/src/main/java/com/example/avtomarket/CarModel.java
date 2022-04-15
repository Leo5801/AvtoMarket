package com.example.avtomarket;

public class CarModel {

    String carname;
    int carimage;

    public CarModel(String carname, int carimage) {
        this.carname = carname;
        this.carimage = carimage;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public int getCarimage() {
        return carimage;
    }

    public void setCarimage(int carimage) {
        this.carimage = carimage;
    }
}
