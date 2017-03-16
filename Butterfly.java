package com.Richard;

/**
 * Created by su7163if on 3/15/2017.
 */
public class Butterfly extends Insect{

    public String getWingColor() {
        return wingColor;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public String getFavFlower() {
        return favFlower;
    }

    public void setFavFlower(String favFlower) {
        this.favFlower = favFlower;
    }

    private String wingColor;
    private String favFlower;

    public Butterfly(String name, int numOfWings, String wingColor, String favFlower){
        super(name, numOfWings);
        this.wingColor = wingColor;
        this.favFlower = favFlower;
    }

    public void printSpeciesData(){
        System.out.println("Butterfly name: " + name + ", Wing Color: " + wingColor + ", Number of Wings: " + numOfWings + ", Number of Legs: " + legs + ", Favorite Flower: " + favFlower);
    }
}
