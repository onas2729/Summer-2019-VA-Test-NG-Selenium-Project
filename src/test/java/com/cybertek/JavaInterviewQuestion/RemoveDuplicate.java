package com.cybertek.JavaInterviewQuestion;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    /**
     Requirement
     Write a return method that can remove the duplicated values from String
     Ex:  removeDup("AAABBBCCC")  ==> ABC

     First, I declare an empty String.

     Then I run a for loop. The loop runs from 0th index of the original String until the last (str.length-1) index.

     In my if condition inside the loop, I compare if each character of the original String is contained in the  empty String.
     If that character is not contained, I concat it to the empty String.
     When the loop finishes, all non duplicate characters are added to the empty String.

     My method returns the String that I declared before the loop.

     */

    public static  String  removeDup( String  str) {
        //First, I declare an empty String.
        String result = "";
        //Then I run a for loop. The loop runs from 0th index of the original String until the last (str.length-1) index.
        for (int i = 0; i < str.length(); i++)

            // In my if condition inside the loop, I compare if each character of the original String is contained in the  empty String.
            if (!result.contains("" + str.charAt(i)))

                // If that character is not contained, I concat it to the empty String.
                result += "" + str.charAt(i);

            //  When the loop finishes, all non duplicate characters are added to the empty String.
            //  My method returns the String that I declared before the loop.
        return result;


    }

    public static String removeDup1(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", ","").replace("[","").replace("]","");
        return  str;
    }


    public static void main(String[] args) {
        String str="AAAABBBBCCCC";

        System.out.println(removeDup(str));
        System.out.println(removeDup1(str));
    }
}
