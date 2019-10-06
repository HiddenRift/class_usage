package com.NordEducator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer printer = new Printer();

        int myAge = 50;
        String myName = "jeff";
        boolean amMale = true;

        Person aPerson = new Person(myAge, myName, amMale);

        printer.printPerson(aPerson);

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
        printer.printNortherner(adam);
        System.out.printf("\n");
        // add alcoholism
        adam.setMaxPints(maxPintsCanDrink);
        printer.printNortherner(adam);

    }
}
