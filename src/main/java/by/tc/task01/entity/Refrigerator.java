package by.tc.task01.entity;

import java.util.Map;

public class Refrigerator extends Appliance{
    private String powerConsuption;
    private String weight;
    private String freezerCapacity;
    private String overallCapacity;
    private String height;
    private String wigth;

    public Refrigerator(String powerConsuption, String weight, String freezerCapacity, String overallCapacity, String height, String wigth) {
        super("Refrigerator");
        this.powerConsuption = powerConsuption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.wigth = wigth;
    }

    public String getPowerConsuption() {
        return powerConsuption;
    }

    public void setPowerConsuption(String powerConsuption) {
        this.powerConsuption = powerConsuption;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(String freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public String getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(String overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWigth() {
        return wigth;
    }

    public void setWigth(String wigth) {
        this.wigth = wigth;
    }
}
