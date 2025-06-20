package org.studyeasy;

public class Car {
    private int doors;
    private String engine;
    private String driver;
    private int speed;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDoors() {
        return doors;
    }

    public String getEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

}
