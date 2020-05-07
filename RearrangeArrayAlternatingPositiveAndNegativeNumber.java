package org.example;

import java.util.Stack;

public class RearrangeArrayAlternatingPositiveAndNegativeNumber {

    public void rearrange(int[] array){
        Stack<Integer> stack = new Stack<>();
        int temp;
        int current=0;
        for (int i=0;i<array.length;i++){
            if(array[i]>0){
                current=i;
            }

            if(array[i]<0){
                temp=array[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] input= {1, 2, 3, -4, -1, 4};
    }
}
