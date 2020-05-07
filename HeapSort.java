package Sorting;

import java.util.Arrays;

public class HeapSort {

    public static int left(int index){
        return index*2+1;
    }
    public static int right(int index){
        return index*2+2;
    }
    public static void swap(int array[], int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void heapify(int array[],int min, int max){
        int largestElement = min;
        int leftChild = left(min);
        int rightChild = right(min);

                    if(leftChild<max && array[leftChild]>=array[largestElement]){
                        largestElement = leftChild;
                    }
                    if(rightChild<max && array[largestElement]<array[rightChild]){
                        largestElement = rightChild;
                    }
        if(largestElement!=min){
            swap(array,largestElement,min);
            heapify(array,largestElement,max);
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

    public static void main(String[] args) {
        int array[] = {2,5,6,7,3,1,9,4};
        heap(array);
        Arrays.stream(array).forEach(a-> System.out.print(a+", "));
        int arr[] = {10,30,20,50,40};
        heap(arr);
        System.out.println();
        Arrays.stream(arr).forEach(b-> System.out.print(b+", "));
        System.out.println();
        System.out.println("K'th largest element is: "+ arr[arr.length-3]);

    }
}
