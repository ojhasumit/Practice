package org.example;

public class MaxConsecutiveOnes {

    public static void max(int array[]){
        int i=0,j=array.length;
        int count =0;
        int newMax =0;
        while (i<j){
            if(array[i]==1){
                count++;
            }
            else {
                count = 0;
            }
            if (count>newMax){
                newMax = count;
            }
            i++;
        }
        System.out.println(newMax);
    }

    public static void main(String[] args) {
        int array[] = {1,1,0,1,1,1};
        max(array);
    }
}
