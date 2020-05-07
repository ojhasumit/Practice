package org.example;

public class IntersectionOfTwoSortedArrays {

    public static void intersection(int[] arrayOne, int[] arrayTwo){
        int i=0;
        int j=0;
        while ((i < arrayOne.length && j < arrayTwo.length)) {
            if(arrayOne[i]<arrayTwo[j]){
                i++;
            } else if (arrayOne[i] > arrayTwo[j]){
                j++;
            }
            else {
                System.out.println(arrayOne[i]);
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arrayOne[] = {34, 21, 41, 22, 35};
        int arrayTwo[] = {11, 21, 34, 45, 61};
        intersection(arrayOne,arrayTwo);
    }
}
