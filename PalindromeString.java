package org.example;

import java.util.Stack;

public class PalindromeString {

    public static int check(String string, int input){
        String result ="" ;
        String[] str = string.split(" ");
        Stack stack = new Stack();

        while (input>0) {
            for (int i = 0; i < string.length(); i++) {
                stack.push(string.charAt(i));
            }
            while (!stack.isEmpty()){
                result+=stack.pop();
            }
            string = result;
            result ="";
            input--;
        }
        if(!result.equals(string)){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String string = "adaada";
        String string1 = "llohe ereth";
        System.out.println(check(string1,2));
    }
}
