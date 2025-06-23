package com.studyeasy;

public class Fish extends Animal {
    private boolean livesInWater = true;
    private boolean hasGills = true;
    private String skin = "scales";
    private String young; // eggs or live

    public Fish() {
        // Default
    }

    public Fish(int height, int weight, String animalType, boolean isIsVertebrate, String bloodType, String young,
            String skin, boolean livesInWater) {
        super(height, weight, animalType, isIsVertebrate = true, bloodType = "Cold blooded");
        this.skin = skin;
        this.young = young;
        this.livesInWater = livesInWater;
    }

    /**
     * @return boolean return the livesInWater
     */
    public boolean isLivesInWater() {
        return livesInWater;
    }

    /**
     * @param livesInWater the livesInWater to set
     */
    public void setLivesInWater(boolean livesInWater) {
        this.livesInWater = livesInWater;
    }

    /**
     * @return boolean return the hasGills
     */
    public boolean isHasGills() {
        return hasGills;
    }

    /**
     * @param hasGills the hasGills to set
     */
    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
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
     * @return String return the young
     */
    public String getYoung() {
        return young;
    }

    /**
     * @param young the young to set
     */
    public void setYoung(String young) {
        this.young = young;
    }

}
