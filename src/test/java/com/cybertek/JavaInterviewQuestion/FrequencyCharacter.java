package com.cybertek.JavaInterviewQuestion;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacter {

    @Test
    public void frequencyCharacter() {
        String str = "AAAABBBCCD";

        Map<Character, Integer> table = new HashMap<>();
        for (Character letter : str.toCharArray()) {
            if (table.containsKey(letter)) {
                table.put(letter, table.get(letter) + 1);
            } else {
                table.put(letter, 1);
            }
        }

        System.out.println(table.toString().replace("{", "").replace("=", "").replace("}", ""));

        int [] num={1,2,3,4,5};
        System.out.println(FindMaximum.maxValue(num)); // It is belong to findMaximum class
    }





    public static void main(String[] args) {
        String str="AAAABBBCCCDDD";

        System.out.println(str.replace("A","E"));

        //float f = Float.parseFloat("25");
        String s = Float.toString(25.0f);
        System.out.println("f = " +" "+ s);
    }

}

