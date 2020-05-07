package org.example;

public class TopTwoNumbersFromArray {
    public static void topTwo(int[] array){
        int first = array[0];
        int second = array[1];
        if(first<second){
            first=array[1];
            second=array[0];
        }
        for (int i=2;i<array.length;i++){
            if(second<array[i]){
                if(first<array[i]){
                    second = first;
                    first = array[i];
                }else {
                    second=array[i];
                }
            }
        }
        System.out.println("First: "+first+" Second: "+second);
    }
    public static void main(String[] args) {
        int array[] = {20, 34, 21, 87, 92,};
        topTwo(array);
    }
}
