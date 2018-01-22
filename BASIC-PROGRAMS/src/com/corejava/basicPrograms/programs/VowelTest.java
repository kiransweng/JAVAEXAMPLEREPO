package com.corejava.basicPrograms.programs;

import java.io.EOFException;

/**
 * Created by Kiran on 11/4/2017.
 * Description: The five alphabets A, E, I, O and U are called vowels. All other alphabets
 * except these 5 vowel letters are called consonants.
 */
public class VowelTest {

    String str = "z";

    public void checkVowel() throws EOFException {

        if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")){
            System.out.println("given char is : " + str + " is vowel");
        }else{
            System.out.println("given char is : " + str + " is not vowel");
        }
    }

}
