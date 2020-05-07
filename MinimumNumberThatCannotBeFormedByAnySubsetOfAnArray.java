package org.example;

public class MinimumNumberThatCannotBeFormedByAnySubsetOfAnArray {
    public static void minimumNumber(int[] array){
    int minNumber = 1;
    for (int i=0;i<array.length;i++){
        if(array[i]<=minNumber){
            minNumber+=array[i];
        }else {
            break;
        }
    }
        System.out.println(minNumber);
    }

    public static void main(String[] args) {
        int array[] = {1,1,1,1,1};
        int array1[] = { 1,1,3,4,6,7,9};
        minimumNumber(array1);
    }
}
