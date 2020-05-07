package org.example;

public class MissingNumberInIntegerArray {

    public static void missingNumber(int array[]){
        int length=array.length;
        int sum=0;
        int total = ((length+1)*(length+2))/2;
        for (int i=0;i<length;i++){
            sum+=array[i];
        }
        System.out.println("Missing No is: "+(total-sum));
    }


    public static void main(String[] args) {
        int array[] ={1, 2, 3, 5};
        missingNumber(array);
    }
}
