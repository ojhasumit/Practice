package org.example;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void move(int array[]){
        int j=0;
        for (int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[j]=array[i];
                j++;
            }
        }
        for (int i=array.length-1;i>=j;i--){
            array[i] = 0;
        }
    }

    public static void main(String[] args) {
        int array[] ={0,1,0,3,12};
        move(array);
        Arrays.stream(array).forEach(a-> System.out.print(a+", "));
    }
}
