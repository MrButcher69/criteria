package by.tc.task01.entity;

import java.util.Map;

public class Laptop extends Appliance{
    private String batteryCapacity;
    private String os;
    private String memoryRom;
    private String systemMemory;
    private String cpu;
    private String displayInchs;

    public Laptop(String batteryCapacity, String os, String memoryRom, String systemMemory, String cpu, String displayInchs) {
        super("Laptop");
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }



    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(String memoryRom) {
        this.memoryRom = memoryRom;
    }

    public String getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(String systemMemory) {
        this.systemMemory = systemMemory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(String displayInchs) {
        this.displayInchs = displayInchs;
    }
}
