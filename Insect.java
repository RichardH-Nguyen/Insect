package com.Richard;

/**
 * Created by su7163if on 3/15/2017.
 */
public abstract class Insect {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfWings() {
        return numOfWings;
    }

    public void setNumOfWings(int numOfWings) {
        this.numOfWings = numOfWings;
    }

    protected String name;
    protected int numOfWings;

    protected static int legs = 6;

    public Insect(String name, int numOfWings){
        this.name = name;
        this.numOfWings = numOfWings;
    }

    public abstract void printSpeciesData();
}
