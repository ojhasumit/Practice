package org.example;

public class StringReverse {

    public static void reverse(char[] s){
        int n = s.length-1;
        for (int i=0; i<n/2; i++) {
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        char[] a = {'h','e','l','l','o'};
        reverse(a);
    }
}
