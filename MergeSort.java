package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merger(int array[],int low, int mid, int high){
        int leftSize = mid-low+1;
        int rightSize = high-mid;

        int[] leftArray = new int[leftSize];
        int[] rightArrary = new int[rightSize];

        for (int i=0;i<leftSize;++i){
            leftArray[i] = array[low+i];
        }
        for (int j=0;j<rightSize;++j){
            rightArrary[j] = array[mid+1+j];
        }
        int i=0,j=0,k=low;

        while (i<leftSize && j<rightSize){
            if(leftArray[i]<=rightArrary[j]){
                array[k] = leftArray[i];
                i++;
            }else {
                array[k] = rightArrary[j];
                j++;
            }
            k++;
        }
        while (i<leftSize){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j<rightSize){
            array[k]=rightArrary[j];
            j++;
            k++;
        }
    }

    public static void sort(int array[], int low, int high){
        if (low<high){
            int mid = (low+high)/2;
            sort(array,low,mid);
            sort(array,mid+1,high);
            merger(array,low,mid,high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,5,6,7,3,1,9,4};
        sort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(a-> System.out.print(a+", "));
    }
}
