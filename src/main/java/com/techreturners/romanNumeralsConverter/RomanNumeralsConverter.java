package com.techreturners.romanNumeralsConverter;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class RomanNumeralsConverter {

    private Dictionary conversionTable = new Hashtable();

    public RomanNumeralsConverter() {
        this.initConversionTable();
    }

    private void initConversionTable(){
        conversionTable.put('I', 1);
        conversionTable.put('V', 5);
        conversionTable.put('X', 10);
        conversionTable.put('L', 50);
        conversionTable.put('C', 100);
        conversionTable.put('D', 500);
        conversionTable.put('M', 1000);
    }

//    I haven't done any validation check
//    assumption:
//    The roman numerals are in correct format
//    and in the range 1 to 3999

    public int convertRomanNumeralToNumber(String romanNumeral){
        int previousValue = 0;
        int currentValue = 0;
        int total = 0;
        for (int i = romanNumeral.length() -1; i >= 0; i--) {
            currentValue = (int) conversionTable.get(romanNumeral.charAt(i));
            if (currentValue >= previousValue)
                total += currentValue;
            else
                total -= currentValue;
            previousValue = currentValue;
        }
        return total;
    }

}
