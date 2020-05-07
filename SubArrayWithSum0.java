package org.example;

public class SubArrayWithSum0 {

    public static void subarray(int[] array){
        int startIndex=0;
        int endIndex=0;
        int sum=0;

        for (int i=0;i<array.length-1;i++){
            if(array[i+1]<=0){
                startIndex =i;
                sum =array[i];
            }
            else if(sum!=0){
                sum +=array[i];
                if(sum==0){
                  endIndex=i;
                }
            }
        }
        System.out.println("Start Index: "+startIndex+" End Index: "+endIndex);
    }

    public static void main(String[] args) {
        int[] array = {4, 2, -3, 1, 6};
        subarray(array);
    }
}
