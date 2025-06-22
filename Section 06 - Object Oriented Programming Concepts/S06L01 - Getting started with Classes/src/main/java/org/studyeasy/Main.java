package org.studyeasy;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setSpeed("120");
        car.setDoors(4);
        car.setEngine("4.2L v6");
        car.setDriver("Green");
        car.setLights("Standard Lighting Package");

        System.out.println(
                "Car speed: " + car.getSpeed() + "MPH" + "\nEngine: " + car.getEngine() + "\nNum doors: "
                        + car.getDoors()
                        + "\nDriver: " + car.getDriver());

        System.out.println("\n*******************************************************\n");

        Car myCar = new Car(2025, "Corvette", "Stringray", 2, "6.2L V8", "Glenn", "Not listed");

        myCar.setDriverSeated(true);
        myCar.setDoorsClosed(true);
        myCar.setEngineOn(true);
        myCar.setCurrSpeed(110);
        myCar.setMusicSystem("5.1 Speaker System");
        myCar.setAirConditioner("Front and Rear with driver and passenger controls");
        myCar.setEntertainmentSystem("THX");
        myCar.setFuelTankCapacity(21);
        myCar.setWheels(4);
        myCar.setSeats(2);
        myCar.setLights("Deluxe Sport Lighting Package that rudely blinds other drivers.");

        System.out.println(
                "My car \nYear: " + myCar.getYear()
                        + "\nMake: " + myCar.getMake()
                        + "\nModel: " + myCar.getModel()
                        + "\nTop Speed: " + myCar.getSpeed()
                        + "\nEngine: " + myCar.getEngine()
                        + "\nTransmission: " + myCar.getTransmission()
                        + "\nNum doors: " + myCar.getDoors()
                        + "\nSteering: " + myCar.getSteering()
                        + "\nMusic System: " + myCar.getMusicSystem()
                        + "\nEntertainment System: " + myCar.getEntertainmentSystem()
                        + "\nAir Conditioner: " + myCar.getAirConditioner()
                        + "\nLights: " + myCar.getLights()
                        + "\nSeats: " + myCar.getSeats()
                        + "\nWheels: " + myCar.getWheels()
                        + "\nFuel Tank: " + myCar.getFuelTankCapacity() + " Gallons"
                        + "\nDriver: " + myCar.getDriver());

        if (myCar.isRunning()) {
            System.out.println("Car is running! Current speed is " + myCar.getCurrSpeed() + " MPH.");
        } else {
            System.out.println("My car is stopped.");
        }

        System.out.println("\n*******************************************************\n");

        // System.out.println(myCar.toString());
    }
}
