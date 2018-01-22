package com.corejava.basicPrograms.programs;

/**
 * Created by Kiran on 11/4/2017.
 * Description: Greatest Common Divisor (GCD) or Highest Common Factor (HCF) of two positive integers
 * is the largest positive integer that
 * divides both numbers without remainder. It is useful for reducing fractions to be in its lowest terms.
 */
public class GCDNoTest {

   int val1 = 72;
   int val2 = 120;
   int gcd;

   public void checkGCD() throws Exception{

       for(int n =1; n<val1 && n<val2 ; n++){
           if(val1%n == 0 && val2%n==0){
               gcd=n;
           }
       }
       System.out.println("The GCD of two numbers is " + val1 + "and" + val2 + "::" + gcd);
   }

}
