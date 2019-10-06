package com.NordEducator;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        System.out.printf("enterAge:\n");
        int nordsAge = Integer.parseInt(scanner.nextLine());
        System.out.printf("enterName:\n");
        String nordsName = scanner.nextLine();
        System.out.printf("male,true/false:\n");
        boolean nordsMale = Boolean.parseBoolean(scanner.nextLine());
        System.out.printf("enterMaxPints:\n");
        int maxPintsCanDrink = Integer.parseInt(scanner.nextLine());

        // note max pints is set later in second instance, it can be done earlier however
        Northerner adam = new Northerner(nordsAge, nordsName, nordsMale, 0);
        System.out.printf("My name is %s,\nI am %d years old\nand it is %b that I am male.\nI can also down %d pints\n\n",
                adam.getName(),
                adam.getAge(),
                adam.getMale(),
                adam.getMaxPints());

        // add alcoholism
        adam.setMaxPints(maxPintsCanDrink);
        System.out.printf("My name is %s,\nI am %d years old\nand it is %b that I am male.\nI can also down %d pints\n\n",
                adam.getName(),
                adam.getAge(),
                adam.getMale(),
                adam.getMaxPints());
    }
}
