package org.example;

public class SmallestAndSecondSmallestORLargestElements {

    public static void smallest(int array[]){
        int firstSmallest = array[0];
        int secondSmallest = array[1];

        if(firstSmallest>secondSmallest){
            secondSmallest = array[0];
            firstSmallest = array[1];
        }
        for (int i=2;i<array.length;i++){
            if(secondSmallest>array[i]){
                if(firstSmallest>array[i]){
                        secondSmallest = firstSmallest;
                        firstSmallest = array[i];
                }else {
                    secondSmallest=array[i];
                }
            }
        }
        System.out.println(firstSmallest +" and "+secondSmallest);
    }

    public static void largest(int array[]){
        int firstlargest = array[0];
        int secondLargest = array[1];

        if(firstlargest<secondLargest){
            secondLargest = array[0];
            firstlargest = array[1];
        }
        for (int i=2;i<array.length;i++){
            if(secondLargest<array[i]){
                if(firstlargest<array[i]){
                    secondLargest = firstlargest;
                    firstlargest = array[i];
                }else {
                    secondLargest=array[i];
                }
            }
        }
        System.out.println(firstlargest +" and "+secondLargest);
    }

    public static void main(String[] args) {
        int array[] = {12, 13, 1, 10, 34, 1};
        smallest(array);
        largest(array);
    }
}
