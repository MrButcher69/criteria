package by.tc.task01.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Appliance {
    private String name;

    public Appliance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals (Object org){
        if(!(org instanceof Appliance)) {
            return false;
        }
        if(name == null || ((Appliance)org).name == null) {
            return false;
        }
        return name.equals(((Appliance)org).name);
    }
}
