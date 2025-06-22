package com.studyeasy;

public class Animal {
    private int height;
    private int weight;
    private String animalType;
    private String bloodType;
    private boolean isVertebrate;

    @Override
    public String toString() {
        return "Animal [height=" + height +
                ", weight=" + weight +
                ", animalType=" + animalType +
                ", isVertebrate=" + isVertebrate +
                ", bloodType=" + bloodType +
                ", getClass()=" + getClass() + "]";
    }

    public Animal() {
        // Default constructor
    }

    public Animal(int height, int weight, String animalType, boolean isVertebrate, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.isVertebrate = isVertebrate;
        this.bloodType = bloodType;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isIsVertebrate() {
        return isVertebrate;
    }

    public void setIsVertebrate(boolean isVertebrate) {
        this.isVertebrate = isVertebrate;
    }

}
