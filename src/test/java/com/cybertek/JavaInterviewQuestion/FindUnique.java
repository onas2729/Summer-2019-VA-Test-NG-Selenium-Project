package com.cybertek.JavaInterviewQuestion;

import java.util.Arrays;
import java.util.Collections;

public class FindUnique {
    /**
     For this task, I declare an “empty String”. And I run a “nested ‘for’ loop”. Both loops run from 0th index of the original String until the last index.

     Inside the first loop, I declare an “int count” with a value of “0”.

     Inside the second loop, I use an “if” statement. I increase the count by 1 each time the value at one index of the string equals to the same on another index.

     After the second loop finishes, “inside the first loop”, I use another “if” statement.

     This time, if count equals to 1; it means this value repeated only one time in the String. It is unique. I concat such characters to my original empty String.

     My method returns this String.

     */

    public static String unique(String str) {
//I declare an “empty String”.
        String unique1="";

//And I run a “nested ‘for’ loop”.
        //Both loops run from 0th index of the original String until the last index.
        for (int i = 0; i <str.length() ; i++) {
            //Inside the first loop, I declare an “int count” with a value of “0”.
            int count =0;
            //Inside the second loop, I use an “if” statement.
            // I increase the count by 1 each time the value at one index of the string equals to the same on another index.
            for (int j = 0; j <str.length() ; j++) {

                if(("" + str.charAt(i)).equals("" + str.charAt(j))){
                    count++;
                }
            }
            //After the second loop finishes, “inside the first loop”, I use another “if” statement.
            if (count ==1){
                // This time, if count equals to 1; it means this value repeated only one time in the String.
                // It is unique. I concat such characters to my original empty String.
                unique1+= str.charAt(i);
            }
        }
        // My method returns this String.
        return unique1;
    }

    public static String Unique(String str) {
        String result ="";
        for(String each : str.split(""))
            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";

        return result;
    }



    public static void main(String[] args) {
        String result="AAABBBCCCDEF";

        System.out.println(unique(result));
        System.out.println(Unique(result));
    }

}
