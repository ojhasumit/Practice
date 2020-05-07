package org.example;

import java.util.Arrays;

public class ReverseStringWithoutaffectingSpecialCharacter {

    public static void reverse(char[] string){
        int len = string.length-1;
        int i =0;

        while (i<len){

            if(!Character.isAlphabetic(string[i])){
                i++;
            }
            else if(!Character.isAlphabetic(string[len])){
                len--;
            }else {
                char temp = string[i];
                string[i] = string[len];
                string[len] = temp;
                len--;
                i++;
            }
        }
    }


    public static void main(String[] args) {
        String string = "Ab,c,de!$";
        String str = "a!!!b.c.d,e'f,ghi";

        char[] charArray = string.toCharArray();

            System.out.println("Input string: " + string);
            reverse(charArray);
            String revStr = new String(charArray);

            System.out.println("Output string: " + revStr);
        }

}
