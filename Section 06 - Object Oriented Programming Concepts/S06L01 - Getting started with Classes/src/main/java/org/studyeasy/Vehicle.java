package org.studyeasy;

public class Vehicle {
    private String engine;
    private String lights;
    private int wheels;
    private int seats;
    private int FuelTankCapacity = 18; // Gallons
    private String transmission = "Automatic";
    private int gears;

    public String getTransmission() {
        return transmission;
    }

    public int getGears() {
        return gears;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getEngine() {
        return engine;
    }

    public String getLights() {
        return lights;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFuelTankCapacity() {
        return FuelTankCapacity;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setLights(String lights) {
        this.lights = lights;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setFuelTankCapacity(int FuelTankCapacity) {
        this.FuelTankCapacity = FuelTankCapacity;
    }

    public boolean isRunning() {
        return false;
    }

}
