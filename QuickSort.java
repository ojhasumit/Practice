package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int array[], int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int sort(int[] array, int low, int high){
        int mid =(low+high)/2;
        int pivot = array[mid];

        while (low<high){
            while (pivot>array[low]){
                low++;
            }
            while (pivot<array[high]){
                high--;
            }
            if(low<=high){
                swap(array,low,high);
                low++;
                high--;
            }
        }
        return low;
    }

    public static void quick(int[] array,int low, int high){
        int pi = sort(array,low,high);

        if(low<pi-1){
            quick(array,low,pi-1);
        }
        if(pi<high){
            quick(array,pi,high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,5,6,7,3,1,9,4};
        quick(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(b-> System.out.print(b+", "));

    }
}
