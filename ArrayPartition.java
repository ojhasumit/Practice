package org.example;

import java.util.Arrays;

public class ArrayPartition {
    public static int left(int index){
        return (index*2)+1;
    }
    public static int right(int index){
        return (index*2)+2;
    }
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void heapify(int array[], int min, int max){
        int largest = min;
        int leftChild = left(min);
        int rightChild = right(min);

        if(leftChild<max && array[leftChild]>=array[largest]){
            largest = leftChild;
        }
        if(rightChild<max && array[rightChild]>array[largest]){
            largest = rightChild;
        }
        if(largest!=min){
            swap(array,largest,min);
            heapify(array,largest,max);
        }
    }

    public static void heap(int[] array){
        int n = array.length-1;

        for (int i=n/2;i>=0;i--){
            heapify(array,i,n);
        }

        for (int i=n;i>=0;i--){
            swap(array,0,i);
            heapify(array,0,i);
        }
    }

    public static int arrayPairSum(int[] nums){
        int sum=0;

        for (int i=0;i<nums.length-1;i=i+2){
            if(nums[i]<nums[i+1]){
                sum+=nums[i];
            }else {
                sum+=nums[i+1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {3,1,2};
        heap(array);
        Arrays.stream(array).forEach(h-> System.out.print(h+", "));
        System.out.println();
        System.out.print("Sum is: ");
        System.out.println(arrayPairSum(array));

    }
}
