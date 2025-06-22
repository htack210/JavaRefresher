package com.studyeasy;

public class Reptile extends Animal {
    private String skin = "Dry";
    private String eggs = "soft-shelled";

    public Reptile() {
        // Default constructor
    }

    public Reptile(int height, int weight, String animalType, boolean isIsVertebrate, String bloodType) {

    }

    /**
     * @return String return the skin
     */
    public String getSkin() {
        return skin;
    }

    /**
     * @param skin the skin to set
     */
    public void setSkin(String skin) {
        this.skin = skin;
    }

    /**
     * @return String return the eggs
     */
    public String getEggs() {
        return eggs;
    }

    /**
     * @param eggs the eggs to set
     */
    public void setEggs(String eggs) {
        this.eggs = eggs;
    }

}
