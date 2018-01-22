package com.corejava.basicPrograms.programs;

/**
 * Created by Kiran on 11/4/2017.
 * Description: The factorial of a positive integer n is equal to 1*2*3*...n.
 */
public class FactorialNoTest {

    int val = -5;
    int factno=1;

    public void factorialTest() throws Exception{

        if (val<0){
            System.out.println("Given no is negative integer:"+val+ "Hence can't be calculate Factorial");
        } else{

            for(int n =1; n<=val; n++){
               factno = factno*n;
            }
            System.out.println("Factorial of Integer " + val + " is:" + factno);
        }
    }

}
