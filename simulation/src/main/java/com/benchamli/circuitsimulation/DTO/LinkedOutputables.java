package com.benchamli.circuitsimulation.DTO;

import java.util.List;

 

public class LinkedOutputables {

    private String type;
    private int pins;
    private List<LinkedOutputables> linked;

 
    public LinkedOutputables() {
    }

 
    public LinkedOutputables(String type, int pins, List<LinkedOutputables> linked) {
        this.type = type;
        this.pins = pins;
        this.linked = linked;
    }

 
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPins() {
        return pins;
    }

    public void setPins(int pins) {
        this.pins = pins;
    }

    public List<LinkedOutputables> getLinked() {
        return linked;
    }

    public void setLinked(List<LinkedOutputables> linked) {
        this.linked = linked;
    }
}
