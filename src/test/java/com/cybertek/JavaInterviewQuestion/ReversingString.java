package com.cybertek.JavaInterviewQuestion;

public class ReversingString {
    /**
     I declare an empty String. Then I run a for loop.
     Loop starts from the last index of the String until the 0th index.

     Inside the loop, I use charAt method of String class. I keep adding characters to the empty String as the loop runs.

     Each time, characters will be added,  starting from the last Char in the original String until the first.

     After the loop finishes, all characters are added to empty String in reverse order.

     */

    public  String StrReverse2(String str) {
        //I declare an empty String.
        String reverse = "";
        //  Then I run a for loop.  Loop starts from the last index of the String until the 0th index.
        //  Inside the loop, I use charAt method of String class. I keep adding characters to the empty String as the loop runs.

        for (int i = str.length() - 1; i >= 0; i--) {
            //  Each time, characters will be added,  starting from the last Char in the original String until the first.
            reverse += str.charAt(i);

        }
        //After the loop finishes, all characters are added to empty String in reverse order.
        return reverse;
    }

    public  String  Reverse(String str) {

        return new StringBuffer(str).reverse().toString();
    }



    public static void main(String[] args) {
        ReversingString result=new ReversingString();

        String str="ABCD";
        System.out.println(result.StrReverse2(str.toLowerCase()));
        System.out.println(result.Reverse(str));

        String result2= result.StrReverse2("ABCDE");
        System.out.println(result2.toLowerCase());
    }
}
