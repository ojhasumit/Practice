package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestNonRepeatingSubsequence {
    public static void subsequence(String string){
        Map<Character,Integer> map = new LinkedHashMap<>();
        int count=0;
        String sub="";

        for (int i=0;i<string.length();i++){
            if(!map.containsKey(string.charAt(i))){
                map.put(string.charAt(i),i);
            }else {
                i=map.get(string.charAt(i));
                map.clear();
            }
        if(map.size()>count){
            count = map.size();
            sub =map.keySet().toString();
        }
        }
        System.out.println(sub);
    }
    public static void main(String[] args) {
        String string ="pwwkew";
        subsequence(string);
    }
}
