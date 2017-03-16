package com.Richard;

/**
 * Created by su7163if on 3/15/2017.
 */
public class Bee extends Insect {
    private String color;
    private boolean honey;
    private String favFlower;

    public Bee(String name, int numOfWings, String color, boolean makesHoney, String favFlower){
        super(name, numOfWings);
        this.color = color;
        this.honey = makesHoney;
        this.favFlower = favFlower;
    }

    public void printSpeciesData(){
        String honeyResult = null;
        if(honey == true){
            honeyResult = "This bee makes honey";
        }else {
            honeyResult = "This bee does not make honey";
        }
        System.out.println("Bee name: " + name + ", Color: " + color +", Nimber of wings: " + numOfWings + ", Number of Legs: " + legs + ", Honey: " + honeyResult + ", Favorite flower: " + favFlower);
    }
}


