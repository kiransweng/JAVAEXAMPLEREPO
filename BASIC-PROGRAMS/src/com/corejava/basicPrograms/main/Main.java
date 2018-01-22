package com.corejava.basicPrograms.main;

import com.corejava.basicPrograms.programs.*;


/**
 * Need to refer the this link for more basic examples : https://www.programiz.com/c-programming/examples/lcm
 */

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        PrimeNoTest primeNoTest = new PrimeNoTest();
        primeNoTest.checkPrimeNo();
        EvenOddNoTest evenOddNoTest = new EvenOddNoTest();
        evenOddNoTest.checkEvenno();
        FactorialNoTest factorialNoTest = new FactorialNoTest();
        factorialNoTest.factorialTest();
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.checkPalindrome();
        VowelTest vowelTest = new VowelTest();
        vowelTest.checkVowel();

        GCDNoTest gcdNoTest = new GCDNoTest();
        gcdNoTest.checkGCD();

        LCMTest lcmTest = new LCMTest();
        lcmTest.checkLCM();

    }
}
