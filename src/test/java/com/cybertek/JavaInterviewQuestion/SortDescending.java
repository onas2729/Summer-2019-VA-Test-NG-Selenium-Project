package com.cybertek.JavaInterviewQuestion;

import java.util.Arrays;

public class SortDescending {
    /**
     The easiest way to sort an Array is to use the Arrays.sort().

     To sort an Array without using the sort method, I need a nested loop.

     Outside the loop I declare a temporary int variable.

     Both inner and outer loops run from 0th index to the last index of the Array.

     Inside the inner loop, I use an “if” condition. If the value in the index value according to first loop is smaller that the value according to the second loop, I assign that value to temp.

     Then I assign the second value to the first index. Next I assign the second value to temp.

     As loop runs, all values from largest to the smallest are sorted because of this swap.

     I return the array out of this method.

     */

    public static int [] sortDescending ( int [] arr) {

        int temp ;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr.length ; j++) {
                if(arr [i]> arr [j]){

                    temp = arr [i];
                    arr [i] =arr [j];
                    arr [j]= temp;
                }
            }
        }

        return arr; }

    public static void main(String[] args) {
        int[] arr = {7, 9, 1, 4};
        System.out.println(Arrays.toString(sortDescending(arr)));
    }
}
