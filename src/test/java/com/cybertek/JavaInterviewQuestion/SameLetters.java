package com.cybertek.JavaInterviewQuestion;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {
    /**
     Requirement: Write a return method that check if a string is build out of the same letters as another string.
     */

    /**
     * First, I use split() method by an empty string (“”) to create a String Array for both strings. This will have each character as a String in an Array.
     * <p>
     * <p>
     * Then I sort them both by using Arrays.sort method.
     * Next, I assign them to a TreeSet, and pass the sorted Arrays to Arrays.asList method. This will remove duplicate elements from the Sets.
     * <p>
     * Lastly, I declare a boolean variable starting as false.
     * <p>
     * In an if condition, I compare if sorted and non-duplicated first collection equals to the second collection. To turn them back into Strings, I use toString(method)
     * <p>
     * If they are equal, I pass true value to my boolean variable.
     * <p>
     * My method returns the Boolean variable.
     */

    public  boolean isSame(String w1, String w2) {
//  First, I use split() method by an empty string (“”) to create a String Array for both strings. This will have each character as a String in an Array.
        String[] w1Array = w1.split("");
        // Then I sort them both by using Arrays.sort method.
        Arrays.sort(w1Array);
        String[] w2Array = w2.split("");
        Arrays.sort(w2Array);

        // Next, I assign them to a TreeSet, and pass the sorted Arrays to Arrays.asList method. This will remove duplicate elements from the Sets.
        TreeSet<String> w1ArrayNonDup = new TreeSet<>(Arrays.asList(w1Array));
        TreeSet<String> w2ArrayNonDup = new TreeSet<>(Arrays.asList(w2Array));
        //      Lastly, I declare a boolean variable starting as false.
        boolean isSame = false;
        //      In an if condition, I compare if sorted and non-duplicated first collection equals to the second collection.
        //      To turn them back into Strings, I use toString(method)
        if (w1ArrayNonDup.toString().equals(w2ArrayNonDup.toString())) {
            // If they are equal, I pass true value to my boolean variable.
            isSame = true;
        }
        //My method returns the Boolean variable.
        return isSame;

    }

    public static void main(String[] args) {
        SameLetters result = new SameLetters();
        String a1 = "aabbbc", a2 = "ccccaaaabbb";
        System.out.println(result.isSame(a1, a2));
    }

}
