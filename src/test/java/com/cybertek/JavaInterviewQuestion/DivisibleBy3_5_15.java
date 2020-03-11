package com.cybertek.JavaInterviewQuestion;

public class DivisibleBy3_5_15 {
    /**
     Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

     if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

     if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

     if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section


     */

    public static void main(String[] args) {
        String DivisibleBy3="Divisible By 3 ";
        String DivisibleBy5="Divisible By 5 ";
        String DivisibleBy15="Divisible By 15 ";

        for (int i = 1; i <101 ; i++) {
            if (i%3==0 && i%5==0 && i%15==0)
                DivisibleBy15 += i+" ";

            if (i%3==0 && i% 15!=0)
                DivisibleBy3 +=i + " ";

            if (i%5==0 && i% 15!=0)
                DivisibleBy5 +=i + " ";

        }
        System.out.println("DivisibleBy15 = " + DivisibleBy15);
        System.out.println("DivisibleBy5 = " + DivisibleBy5);
        System.out.println("DivisibleBy3 = " + DivisibleBy3);
    }

}
