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
    private String steering = "Power";
    private String musicSystem = "Basic";
    private String airConditioner = "Front Only";
    private String fridge = "None";
    private String entertainmentSystem = "None";

    public Car(int year, String make, String model, int doors, String engine, String driver, String speed) {
        super(); // or super(engine) if Vehicle had such a constructor
        this.year = year;
        this.make = make;
        this.model = model;
        this.doors = doors;
        super.setEngine(engine);
        this.driver = driver;
        this.speed = speed;
    }

    public Car(String make, String model, int doors, String engine) {
        this.make = make;
        this.model = model;
        this.doors = doors;
        super.setEngine(engine); // Use Vehicle's setter
    }

    public Car() {
        // Default constructor
    }

    public void setDoors(int doors) {
        this.doors = doors;
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

    @Override
    public boolean isRunning() {
        return doorsClosed && engineOn && driverSeated && currSpeed > 0;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public String getFridge() {
        return fridge;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    public void setMusicSystem(String musicSystem) {
        this.musicSystem = musicSystem;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public void setEntertainmentSystem(String entertainmentSystem) {
        this.entertainmentSystem = entertainmentSystem;
    }

    @Override
    public String toString() {
        return "Car [year=" + year + ", make=" + make + ", model=" + model + ", doors=" + doors + ", doorsClosed="
                + doorsClosed + ", engineOn=" + engineOn + ", currSpeed=" + currSpeed + ", driverSeated=" + driverSeated
                + ", driver=" + driver + ", speed=" + speed + ", steering=" + steering + ", musicSystem=" + musicSystem
                + ", airConditioner=" + airConditioner + ", fridge=" + fridge + ", entertainmentSystem="
                + entertainmentSystem + ", getTransmission()=" + getTransmission() + ", getGears()=" + getGears()
                + ", getEngine()=" + getEngine() + ", getLights()=" + getLights() + ", getWheels()=" + getWheels()
                + ", getSeats()=" + getSeats() + ", getFuelTankCapacity()=" + getFuelTankCapacity() + ", getSpeed()="
                + getSpeed() + ", getDoors()=" + getDoors() + ", getClass()=" + getClass() + ", getDriver()="
                + getDriver() + ", getMake()=" + getMake() + ", getModel()=" + getModel() + ", getYear()=" + getYear()
                + ", getDoorsClosed()=" + getDoorsClosed() + ", getEngineOn()=" + getEngineOn() + ", getDriverSeated()="
                + getDriverSeated() + ", getCurrSpeed()=" + getCurrSpeed() + ", isRunning()=" + isRunning()
                + ", getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
                + ", getAirConditioner()=" + getAirConditioner() + ", getFridge()=" + getFridge()
                + ", getEntertainmentSystem()=" + getEntertainmentSystem() + "]";
    }

}
