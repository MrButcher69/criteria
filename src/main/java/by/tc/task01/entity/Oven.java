package by.tc.task01.entity;

import java.util.Map;
import java.util.Objects;

public class Oven extends Appliance{
    private String powerConsuption;
    private String weight;
    private String capacity;
    private String depth;
    private String height;
    private String wigth;

    public Oven(String powerConsuption, String weight, String capacity, String depth, String height, String wigth) {
        super("Oven");
        this.powerConsuption = powerConsuption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
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

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
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
