package com.cybertek.JavaInterviewQuestion;

public class Divide_without_operator {
/*

Second, division is subtracting (cikartma) a number from the other as long as it is possible.







 */
    public static void Division(int num1, int num2) {
// There two things here.

//First if the dividing number is 0, this will an operation error. When this condition fails,
// my method returns “invalid number”
        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }
        // Second, division is subtracting (cikartma) a number from the other as long as it is possible.
        // So I declare an int count variable at 0. Then I run a while loop.
        int count =0;

        // While first number is greater than or equal to the second number;
        //I subtract the second number from the first and assign it as the new value to the first number.
        //I keep increasing the count by 1 each time.
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        //At the end of the loop, the last value of the first number is the remainder.
        //Count is the result of the division.
        System.out.println(count+" and remainder is "+num1);

    }

    public static void main(String[] args) {

        Division(10, 5);
        System.out.println("Ekrem Guler");
    }
}
