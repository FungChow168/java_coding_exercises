package com.techreturners.romanNumeralsConverter;

import com.techreturners.exercise005.Exercise005;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsConverterTest {

    private RomanNumeralsConverter converter = new RomanNumeralsConverter();

    @Test
    public void checkRomanNumeralsConverterMinimum (){
        assertEquals(1, converter.convertRomanNumeralToNumber("I"));
    }

    @Test
    public void checkRomanNumeralsConverter01 (){
        assertEquals(3, converter.convertRomanNumeralToNumber("III"));
    }

    @Test
    public void checkRomanNumeralsConverter02 (){
        assertEquals(4, converter.convertRomanNumeralToNumber("IV"));
    }

    @Test
    public void checkRomanNumeralsConverter03 (){
        assertEquals(6, converter.convertRomanNumeralToNumber("VI"));
    }

    @Test
    public void checkRomanNumeralsConverter04 (){
        assertEquals(8, converter.convertRomanNumeralToNumber("VIII"));
    }

    @Test
    public void checkRomanNumeralsConverter05 (){
        assertEquals(9, converter.convertRomanNumeralToNumber("IX"));
    }

    @Test
    public void checkRomanNumeralsConverter06 (){
        assertEquals(39, converter.convertRomanNumeralToNumber("XXXIX"));
    }

    @Test
    public void checkRomanNumeralsConverter07 (){
        assertEquals(49, converter.convertRomanNumeralToNumber("XLIX"));
    }

    @Test
    public void checkRomanNumeralsConverter08 (){
        assertEquals(69, converter.convertRomanNumeralToNumber("LXIX"));
    }

    @Test
    public void checkRomanNumeralsConverter09 (){
        assertEquals(999, converter.convertRomanNumeralToNumber("CMXCIX"));
    }

    @Test
    public void checkRomanNumeralsConverter10 (){
        assertEquals(1738, converter.convertRomanNumeralToNumber("MDCCXXXVIII"));
    }

    @Test
    public void checkRomanNumeralsConverter11 (){
        assertEquals(2649, converter.convertRomanNumeralToNumber("MMDCXLIX"));
    }

    @Test
    public void checkRomanNumeralsConverter21 (){
        assertEquals(3444, converter.convertRomanNumeralToNumber("MMMCDXLIV"));
    }

    @Test
    public void checkRomanNumeralsConverterMaximum (){
        assertEquals(3999, converter.convertRomanNumeralToNumber("MMMCMXCIX"));
    }

}
