package org.example;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void move(int[] array){
        int temp =array.length-1;
        for (int i=array.length-1;i>=0;i--){
            if(array[i]!=0){
                array[temp] = array[i];
                temp--;
            }
        }
    }

    public static void merge(int[] arrayOne,int[] arrayTwo){
        int i=arrayOne.length-arrayTwo.length,j=0,k=0;
            move(arrayOne);
        while (k<arrayOne.length){
            if(i<arrayOne.length && arrayOne[i]<=arrayTwo[j]){
                arrayOne[k]=arrayOne[i];
                i++;
            }else {
                arrayOne[k]=arrayTwo[j];
                j++;
            }
            k++;
        }
        Arrays.stream(arrayOne).forEach(a-> System.out.print(a+", "));
    }

    public static void main(String[] args) {
        int[] arrayOne = {1,2,3,0,0,0};
        int[] arrayTwo = {2,5,6};
        merge(arrayOne,arrayTwo);
    }
}