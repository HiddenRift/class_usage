package com.NordEducator;

public class Northerner extends Person {
    private int maxPints;

    public int getMaxPints() {
        return maxPints;
    }

    public void setMaxPints(int maxPints) {
        this.maxPints = maxPints;
    }

    Northerner(int age, String name, Boolean isMale, int maxPints) {
        super(age, name, isMale);
        this.maxPints = maxPints;
    }
}
