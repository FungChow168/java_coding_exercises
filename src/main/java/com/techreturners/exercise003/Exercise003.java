package com.techreturners.exercise003;

public class Exercise003 {

    private String[] iceCreamFlavours = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip",
                                         "Chocolate", "Mango Sorbet"};

    int getIceCreamCode(String iceCreamFlavour) {
        int result = 10;
        for (int i=0; i < iceCreamFlavours.length; i++)
            if (iceCreamFlavours[i].equalsIgnoreCase(iceCreamFlavour)) {
                result = i;
                break;
            }
        return result;
    }

    String[] iceCreamFlavours() {
        return iceCreamFlavours;
    }

}
