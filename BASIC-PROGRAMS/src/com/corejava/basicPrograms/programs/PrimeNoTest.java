package com.corejava.basicPrograms.programs;

/**
 * Created by Kiran on 11/4/2017.
 * Description: A prime number is a positive integer which is divisible only by 1 and itself. For example: 2, 3, 5, 7, 11, 13
 */
public class PrimeNoTest {


   public  void checkPrimeNo() throws Exception {

       int val = 51;
       boolean flag = false;

       for (int n = 2 ; n<val; n++){

           if(val%n==0){
               flag=true;
           }
       }

       if(flag==false){
           System.out.println(val+" is a prime no");
       }else {
           System.out.println(val+" is not a prime no");
       }

   }

}
