package com.corejava.basicPrograms.programs;

/**
 * Created by Kiran on 11/4/2017.
 * Description: An integer is a palindrome if the reverse of that number is equal to the original number
 * A palindromic number or numeral palindrome is a number that remains the same when its digits are reversed.
 * Like 16461, for example, it is "symmetrical". The term palindromic is derived from palindrome, which refers
 * to a word (such as rotor or racecar) whose spelling is unchanged when its letters are reversed
 */
public class PalindromeTest {

    int val = 53235;
    int reverseNo;
    int reminder;

    public void checkPalindrome() {
        int originalNo = val;
        while(val!=0){
            reminder = val%10;
            reverseNo = reverseNo*10+reminder;
            val = val/10;
        }
        if (originalNo == reverseNo){
            System.out.println("val is Palindrome No");
        }else {
            System.out.println("val is not a Palindrome No");
        }

    }

}
