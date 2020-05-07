package org.example;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicatesFromArray {
    public static void removeDuplicate(int[] array){
        Stack<Integer> stack = new Stack<>();
        for (int i=array.length-1;i>=0;i--){
            if(!stack.contains(array[i])){
                stack.add(array[i]);
            }
        }
        int sizeWithoutDuplicate = stack.size();
        int j=0;
        for (int i=0;i<sizeWithoutDuplicate;i++){
            if(!stack.isEmpty()){
                array[i]=stack.pop();
            }else {
                array[array.length]=array[array.length-1];
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 1, 2, 3, 4, 5};
        removeDuplicate(array);
        Arrays.stream(array).forEach(a-> System.out.print(a+", "));
    }
}
