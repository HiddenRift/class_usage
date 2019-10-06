package com.NordEducator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int myAge = 50;
        String myName = "jeff";
        boolean amMale = true;

        Person aPerson = new Person(myAge, myName, amMale);

        System.out.printf("My name is %s,\nI am %d years old\nand it is %b that I am male\n\n",
                aPerson.getName(),
                aPerson.getAge(),
                aPerson.getMale());

        int nordsAge = 50;
        String nordsName = "Adam";
        boolean nordsMale = true;
        int maxPintsCanDrink = 60;

        Northerner adam = new Northerner(nordsAge, nordsName, nordsMale, maxPintsCanDrink);
        System.out.printf("My name is %s,\nI am %d years old\nand it is %b that I am male.\nI can also down %d pints\n\n",
                adam.getName(),
                adam.getAge(),
                adam.getMale(),
                adam.getMaxPints());
    }
}
