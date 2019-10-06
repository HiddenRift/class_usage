package com.NordEducator;

public class Person {
    private int age;
    private String name;
    private Boolean isMale;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Boolean getMale() {
        return isMale;
    }

    Person(int age, String name, Boolean isMale){
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }
}
