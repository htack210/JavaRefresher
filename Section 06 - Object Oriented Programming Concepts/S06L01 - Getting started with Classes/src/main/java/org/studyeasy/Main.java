package org.studyeasy;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setSpeed("120");
        car.setDoors(4);
        car.setEngine("4.2L v6");
        car.setDriver("Green");

        System.out.println(
                "Car speed: " + car.getSpeed() + "MPH" + "\nEngine: " + car.getEngine() + "\nNum doors: "
                        + car.getDoors()
                        + "\nDriver: " + car.getDriver());

        System.out.println("\n*******************************************************\n");

        Car myCar = new Car(2025, "Corvette", "Stringray", 2, "6.2L V8", "Glenn", "Not listed");

        myCar.setDriverSeated(true);
        myCar.setDoorsClosed(true);
        myCar.setEngineOn(true);
        myCar.setCurrSpeed(100);
        myCar.steering = "Power Steering";

        System.out.println(
                "My car \nYear: " + myCar.getYear() + "\nMake: " + myCar.getMake() + "\nModel: " + myCar.getModel()
                        + "\nTop Speed: " + myCar.getSpeed()
                        + "\nEngine: " + myCar.getEngine()
                        + "\nNum doors: "
                        + myCar.getDoors()
                        + "\nSteering: "
                        + myCar.steering
                        + "\nDriver: " + myCar.getDriver());

        if (myCar.isRunning()) {
            System.out.println("Caris running! Current speed is " + myCar.getCurrSpeed() + " MPH.");
        } else {
            System.out.println("My car is stopped.");
        }

        System.out.println("\n*******************************************************\n");
    }
}
