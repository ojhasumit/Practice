package org.example;

public class LongestCommonPrefix {

    public static void commonPrefix(String string, String string1, String string2){
        String a ="";
        for (int i=0;i<string.length();i++){
            if(string.charAt(i)==string1.charAt(i) && i<string1.length()){
                if(string1.charAt(i)==string2.charAt(i) && i<string2.length()){
                    a+=string.charAt(i);
                }
            }
        }
        System.out.println("Prefix is: "+a);
    }

    public static void common(String array[]){
        String first = array[0];
        String answer="";

        for (int i=1;i<array.length;i++) {
            answer = "";
            int len = first.length()<array[i].length()?first.length()-1:array[i].length()-1;

            for (int j=0;j<=len;j++){
                if(first.charAt(j)==array[i].charAt(j)){
                    answer += array[i].charAt(j);
                }
            }
            first = answer;
        }
        System.out.println(first);
    }

    public static void main(String[] args) {
        String string1 = "Flower";
        String string2 = "Flight";
        String string3 = "Float";
        String array[] ={"Flower","Flow","Flight","Fluent"};
        commonPrefix(string1,string2,string3);
        common(array);
    }
}
