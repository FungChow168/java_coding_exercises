package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person ) {
        // Add your code here
        if (person.getLocation().equalsIgnoreCase("Manchester"))
            return true;
        else
            return false;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        // Add your code here
        int legalAgeLimit = 18;
        if(person.getAge() >= legalAgeLimit)
            return true;
        else
            return false;
    }
    
}
