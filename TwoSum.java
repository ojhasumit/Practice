package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void pair(int array[],int num){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(num-array[i],i);
            }else {
                System.out.println(map.get(array[i])+", "+i);
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 7, 11, 15};
        int num = 9;
        pair(array,num);
    }
}
