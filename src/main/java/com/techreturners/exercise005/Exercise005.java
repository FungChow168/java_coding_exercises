package com.techreturners.exercise005;

import java.util.stream.IntStream;
import java.util.*;

public class Exercise005 {

    private ArrayList <Integer> letterList = new ArrayList<Integer>();

    public Exercise005 (){
        IntStream.range(97,123).forEach( n -> letterList.add(n)); // initialize letterList
    }

    public boolean isPangram(String input) {
        if (input == null || input.trim().length() == 0)
            return false;
        int[] inputArray = input.toLowerCase().chars().toArray();
        for (int i=0; i<inputArray.length; i++){
            letterList.remove(new Integer(inputArray[i]));
            if (letterList.size() == 0)
                return true;
        }
        return false;
    }

}
