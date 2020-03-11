package com.cybertek.JavaInterviewQuestion;

import java.util.Arrays;

public class FindMaximum {
    /**
     To find the maximum number in an Array, I need to a for loop and make comparison.
     First, I declare an int max number which equals to the Minimum Value of Integer.
     Inside the loop, if the value in an index is greater than int max; I assign that value to max.
     My method returns max.

     */

    public static int maxValue( int[]  n ) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if( n [i] > max)
                max = n [i];
        }
        return max;
    }


    public static void main(String[] args) {


        int[] num={1,2,3,4,5,6,7,8};
        System.out.println(maxValue(num));

        FindMaximum met=new FindMaximum();
        int num3=met.maxValue(num);
        System.out.println(num3);


    }
}


