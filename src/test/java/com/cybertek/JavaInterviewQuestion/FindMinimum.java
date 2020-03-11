package com.cybertek.JavaInterviewQuestion;

public class FindMinimum {
    /**
     To find the minimum number in an Array, I need to a for loop and make comparison.

     First, I declare an int min number which equals to the Maximum Value of Integer.

     Inside the loop, if the value in an index is smaller than int min; I assign that value to min.

     My method returns min.

     */


    public static int minValue(int [] n){
        //First, I declare an int min number which equals to the Maximum Value of Integer.
        int min=Integer.MAX_VALUE;
        //Inside the loop, if the value in an index is smaller than int min; I assign that value to min.
        for (int i = 0; i <n.length ; i++) {
            if (n[i]<min)
                min=n[i];
        }
       // My method returns min.
        return min;
    }

    public static void main(String[] args) {

        int[] num={1,2,3,4,5,6,7,8};
        System.out.println(minValue(num));

        FindMinimum minimum=new FindMinimum();
        int result=minimum.minValue(num);
        System.out.println(result);

    }
}


