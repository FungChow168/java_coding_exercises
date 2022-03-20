package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person ) {
        return person.getLocation().equalsIgnoreCase("Manchester")?true:false;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return person.getAge() >= ageLimit?true:false;
    }
    
}
