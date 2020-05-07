package Strings;

public class Immutable {

    public static void main(String[] args) {
        String s = "abc";
        String v = s;
        s = s+"xyz";
        s =s.concat("abc");
        System.out.println(s);
        String s1 = "abc";
        System.out.println(s.equals(s1));
        System.out.println(v);
    }
}
