package org.studyeasy;

public class Car extends Vehicle {
    private int year;
    private String make;
    private String model;
    private int doors;
    private boolean doorsClosed;
    private boolean engineOn;
    private int currSpeed;
    private boolean driverSeated;
    private String driver;
    private String speed;
    public String steering;
    public String musicSystem;
    public String airConditioner;
    public String fridge;
    public String entertainmentSystem;

    public Car(int year, String make, String model, int doors, String engine, String driver, String speed) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public Car(String make, String model, int doors, String engine) {
        this.make = make;
        this.model = model;
        this.doors = doors;
        this.engine = engine;
    }

    public Car() {
        // Default constructor
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public int getDoors() {
        return doors;
    }

    public String getEngine() {
        return engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        return this.year;
    }

    public boolean getDoorsClosed() {
        return doorsClosed;
    }

    public void setDoorsClosed(boolean doorsClosed) {
        this.doorsClosed = doorsClosed;
    }

    public boolean getEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    public boolean getDriverSeated() {
        return driverSeated;
    }

    public void setDriverSeated(boolean driverSeated) {
        this.driverSeated = driverSeated;
    }

    public int getCurrSpeed() {
        return currSpeed;
    }

    public void setCurrSpeed(int currSpeed) {
        this.currSpeed = currSpeed;
    }

    public boolean isRunning() {
        return doorsClosed && engineOn && driverSeated && currSpeed > 0;
    }

}
