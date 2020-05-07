package org.example;

public class SubArrayWithMaximumSum {

    public static void maximumSubarray(int[] array){
         int max=0;
        for (int i=0;i<array.length;i++) {
            if (array[i] > max) {
                max = array[i];
            } else if(array[i]>0){

                max += array[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] array ={-2,1,-3,4,-1,2,1,-5,4};
        maximumSubarray(array);
    }
}
