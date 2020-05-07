package org.example;

import java.util.Arrays;
import java.util.Stack;

public class ArrayMovement {

    public static void movement(int[] array, int move){
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<move;i++){
            stack.push(array[i]);
        }
        for (int i=0;i<=array.length-1-move;i++){
            array[i]=array[move+i];
        }
        for (int i=array.length-1;i>array.length-1-move;i--){
            array[i]=stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int move=2;
        movement(array,move);
        Arrays.stream(array).forEach(a-> System.out.print(a+", "));
    }
}
