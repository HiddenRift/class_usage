package com.NordEducator;

public class Printer {

    Printer(){
        //nothing to set up here
    }

    public void printPerson(Person a){
        System.out.printf("My name is %s,\nI am %d years old\nand it is %b that I am male\n",
                a.getName(),
                a.getAge(),
                a.getMale());
    }

    public void printNortherner(Northerner a){
        this.printPerson(a);
        System.out.printf("I can also down %d pints\n", a.getMaxPints());
    }

}
