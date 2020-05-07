package org.example;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static void intersection(int[] arrayOne,int arrayTwo[]){
        int i=0;
        int j=0;

        while (i<arrayOne.length && j<arrayTwo.length){

            if(arrayOne[i]>arrayTwo[j]){
                i++;
            }else if(arrayOne[i]<arrayTwo[j]){
                j++;
            }else {
                System.out.print(arrayOne[i]+", ");
                i++;
                j++;
            }
        }
    }

    public static int[] intersectionWithMap(int arrayOne[], int[] arrayTwo){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> set = new ArrayList<>();

        for (int i=0;i<arrayOne.length;i++){
            int count = map.getOrDefault(arrayOne[i],0);
            map.put(arrayOne[i],count+1);
        }
        for (int i=0;i<arrayTwo.length;i++){
            if(map.containsKey(arrayTwo[i]) && map.get(arrayTwo[i])>=0){
                map.put(arrayTwo[i],map.get(arrayTwo[i])-1);
                set.add(arrayTwo[i]);
            }
        }
        int[] result = new int[set.size()];
        for (int i=0;i<result.length;i++){
            result[i] = set.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        intersection(nums1,nums2);
        System.out.println();
        Arrays.stream(intersectionWithMap(nums1,nums2)).forEach(a-> System.out.print(a+", "));

    }
}
