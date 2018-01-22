package com.corejava.basicPrograms.programs;

/**
 * Created by Kiran on 11/4/2017.
 * Description: The LCM of two integers n1 and n2 is the smallest positive integer that
 * is perfectly divisible by both n1 and n2 (without a remainder). For example: the LCM of 72 and 120 is 360.
 */
public class LCMTest {

    int n1 = 72;
    int n2 = 120;
    int gcd;
    int lcm;

    public void checkLCM () throws Exception {

        for(int n =1; n<n1 && n<n2 ; n++){
            if(n1%n == 0 && n2%n==0){
                gcd=n;
            }
        }

        lcm = (n1*n2)/gcd;
        System.out.println("LCM of two numbers:" + n1 + "and" + n2 +":is --" + lcm);

    }



}
