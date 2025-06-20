package org.studyeasy;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setSpeed(120);
        car.setDoors(4);
        car.setEngine("4.2L v6");
        car.setDriver("Green");

        System.out.println(
                "Car speed: " + car.getSpeed() + "MPH" + "\nEngine: " + car.getEngine() + "\nNum doors: "
                        + car.getDoors()
                        + "\nDriver: " + car.getDriver());

        System.out.println("\n*******************************************************\n");

        Car myCar = new Car(2025, "Corvette", "Stringray", 2, "6.2L V8", "Glenn", 140);

        System.out.println(
                "My car \nYear: " + myCar.getYear() + "\nMake: " + myCar.getMake() + "\nModel: " + myCar.getModel()
                        + "\nSpeed: " + myCar.getSpeed()
                        + "MPH"
                        + "\nEngine: " + myCar.getEngine()
                        + "\nNum doors: "
                        + myCar.getDoors()
                        + "\nDriver: " + myCar.getDriver());

        System.out.println("\n*******************************************************\n");
    }
}
