package com.cybertek.JavaInterviewQuestion;

public class Numbers_Odd_or_Even {

    public static String oddOrEven(int a) {

        String oddOr = "";

        if (a == 0) {
            oddOr = "even";
        } else {

            if (a % 2 == 0) {
                oddOr = "even";
            } else {
                oddOr = "odd";
            }
        }
        return oddOr;
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(22));
    }


}
