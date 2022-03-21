package com.techreturners.exercise005;

public class Exercise005 {

    private final String[] LETTERLIST = {"a","b","c","d","e","f","h","i","j","k","l","m","n","o","p","q","r",
                            "s","t","u","v","w","x","y","z"};

    public boolean isPangram(String input) {
        for (String aLetter: LETTERLIST)
            if (input.toLowerCase().indexOf(aLetter) == -1)
                return false;
        return true;
    }

}
