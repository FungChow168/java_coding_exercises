package com.techreturners.exercise005;

public class Exercise005 {

    private final String[] letterList = {"a","b","c","d","e","f","h","i","j","k","l","m","n","o","p","q","r",
                            "s","t","u","v","w","x","y","z"};

    public boolean isPangram(String input) {
        for (String aLetter: letterList)
            if (input.toLowerCase().indexOf(aLetter) == -1)
                return false;
        return true;
    }

}
