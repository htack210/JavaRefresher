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
    }
}
