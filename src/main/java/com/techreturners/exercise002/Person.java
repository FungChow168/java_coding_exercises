package com.techreturners.exercise002;

public class Person {
    private String firstName;
    private String lastName;
    private String location;
    private int age;

    public Person(String firstName, String lastName, String location, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.age = age;
    }

    public String getLocation(){
        return location;
    }

    public int getAge(){
        return age;
    }

}
