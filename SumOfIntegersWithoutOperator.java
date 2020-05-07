package org.example;

public class SumOfIntegersWithoutOperator {

    public static void add(int a, int b)
    {
        //int length = Math.max(a,b);
        while (a>0) {
            b++;
            a--;
        }
        while (a<0) {
            a++;
            b--;
        }
        System.out.println(b);
            }


    public static void main(String[] args) {
        int a = -2;
        int b = 3;
        add(a,b);
    }
}
