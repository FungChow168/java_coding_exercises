package com.techreturners.exercise001;

import java.util.List;
import java.lang.StringBuilder;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return originalPrice * (1 + vatRate /100);
    }

    public String reverse(String sentence) {
        // Add your code here
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int result = 0;
        for (User aUser: users)
            if (aUser.getType().equalsIgnoreCase("Linux"))
                result += 1;

        return result;
    }
}
