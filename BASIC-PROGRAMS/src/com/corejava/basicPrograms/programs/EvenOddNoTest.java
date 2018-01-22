package com.corejava.basicPrograms.programs;

/**
 * Created by Kiran on 11/4/2017.
 * Description: An even number is an integer which is "evenly divisible" by two. This means that
 * if the integer is divided by 2, it yields no remainder. Zero is an even number because
 * zero divided by two equals zero, which despite not being a natural number, is an integer
 */
public class EvenOddNoTest {

    int val = 11;
    boolean flag = false;

    public void checkEvenno() {

        if(val%2==0){
            flag = true;
        }
        if(flag==true){
            System.out.println(val + " is a even no");
        }else {
            System.out.println(val + " is a odd no");
        }
    }

}
