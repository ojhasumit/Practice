package org.example;

import java.util.Stack;

public class NonRepeatedElement {

    public static void nonRepeated(int array[]){
        Stack<Integer> stack = new Stack<>();
        int sum =0;
        int total=0;
        for (int i=0;i<array.length;i++){
            if (!stack.contains(array[i])){
                stack.add(array[i]);
            }
            total+=array[i];
        }
        while (!stack.isEmpty()){
            sum+=stack.pop();
        }
        System.out.println("Non Repeated element is: "+(2*sum-total));
}

    public static void main(String[] args) {
       int array[] = {1, 1, 2, 2, 3, 4, 4, 5, 5};
       nonRepeated(array);
    }
}
