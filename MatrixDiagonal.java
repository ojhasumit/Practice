package org.example;

public class MatrixDiagonal {
    public static void main(String[] args) {

        for (int i=0;i<=7;i++){
            for (int j=0;j<=7;j++){
                if(i==j || i+j==7
                ){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
