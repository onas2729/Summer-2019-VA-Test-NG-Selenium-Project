package com.cybertek.JavaInterviewQuestion;

public class FrequencyCharacterLongWay {
    /**
     First, I have to remove the duplicates.  I declare an empty String.

     Then I run a for loop. The loop runs from 0th index of the original String until the last (str.length-1) index.

     In my if condition inside the loop, I compare if each character of the original String is contained in the  empty String.
     If that character is not contained, I concat it to the empty String.
     When the loop finishes, all non duplicate characters are added to the empty String.

     Secondly, I need to check how many times each character repeats.

     To achieve that, I first declare an empty String. And then run a nested for loop.

     Outer loop runs from 0th index to the last index of the Non-Duplicates string I have from the first step.

     Inside the outer loop, I declare int count = 0.

     Inner loop runs from the 0th index of the original String until its last index.

     Inside the inner loop, I use an “if” statement. If a character in the NonDup string equals to a character in the original String, I increase the count by 1.

     After inner loop finishes, I make a simple concat. I add each char in my NonDup string and concat it by the count to the String I declared as empty before the nested loop.

     The method returns this String.

     */

    public  static String FrequencyOfChars(String str) {

        String nonDup = "";
        for(int i=0; i < str.length(); i++)
            if(!nonDup.contains(""+str.charAt(i)))
                nonDup+= ""+str.charAt(i);

        String expectedResult = "";
        for( int j=0;j < nonDup.length(); j++) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == nonDup.charAt(j))
                    count++;
            }

            expectedResult +=nonDup.charAt(j)+"" + count;
        }
        return expectedResult;
    }

    public static void main(String[] args) {
        FrequencyCharacterLongWay result=new FrequencyCharacterLongWay();
        String str="AAAABBBCCCDDD";
        System.out.println(result.FrequencyOfChars(str));
    }
}
