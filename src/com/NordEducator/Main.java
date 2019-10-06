package com.NordEducator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int myAge = 50;
        String myName = "jeff";
        boolean amMale = true;

        Person aPerson = new Person(myAge, myName, amMale);

        System.out.printf("My name is %s,\nI am %d years old\nand it is %b that I am male",
                aPerson.getName(),
                aPerson.getAge(),
                aPerson.getMale());
    }
}
