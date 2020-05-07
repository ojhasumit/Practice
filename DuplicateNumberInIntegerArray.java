package org.example;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberInIntegerArray {

    public static void duplicate(int[] array){
        Map<Integer,Integer> hashmap = new HashMap();
        for (int i=0;i<array.length;i++){
            int count = hashmap.getOrDefault(array[i],0);
            hashmap.put(array[i],count+1);
        }
        for (Map.Entry<Integer,Integer> a:hashmap.entrySet()){
            if(a.getValue()>1){
                System.out.println(a.getKey());
            }
        }
    }

    public static void main(String[] args) {
        int[] array= {0, 3, 1, 2, 3};
        duplicate(array);
    }
}
