package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatedElementInArray {
    public static void repeated(int[] array){
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i=0;i<array.length;i++){
            int count = map.getOrDefault(array[i],0);
            map.put(array[i],count+1);
        }
        for (Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>1){
                System.out.println("First Repeated value is: "+m.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        int input[] = {10, 5, 3, 4, 3, 5, 6};
        repeated(input);
    }
}
