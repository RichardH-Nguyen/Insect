package com.Richard;

import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {
        Butterfly test1 = new Butterfly("Monarch", 4, "Orangs and black", "Milkweed");
        Butterfly test2 = new Butterfly("Common Yellow Swallowtail", 4, "Yellow and black", "Milk parsley");
        //test1.printSpeciesData();
        //test2.printSpeciesData();

        Bee bTest1 = new Bee("Honey bee", 4, "Yellow and black", true, "Jasmine");
        Bee bTest2 = new Bee("Bumble bee", 4, "Yellow, black, and white", false, "Clover");

        //bTest1.printSpeciesData();
        //bTest2.printSpeciesData();

        LinkedList<Insect> insects = new LinkedList<Insect>();
        insects.add(test1);
        insects.add(test2);
        insects.add(bTest1);
        insects.add(bTest2);

        for (Insect i : insects) {
            i.printSpeciesData();
        }
    }
}
