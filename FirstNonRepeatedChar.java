package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public static void getFirstNonRepeated(String string){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i=0;i<string.length();i++){
            int count = map.getOrDefault(string.charAt(i),0);
            map.put(string.charAt(i),count+1);
        }
        for (Map.Entry<Character,Integer> m:map.entrySet()) {
            if(m.getValue()==1){
                System.out.println("First Non repeated character: "+m.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        String string = "hello";
        getFirstNonRepeated(string);
    }
}
