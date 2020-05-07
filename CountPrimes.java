package org.example;

public class CountPrimes {

    public static int countPrimes(int n) {

        if(n<=1){
            return 0;
        }

        boolean[] prime=new boolean[n];
        int count=n-2;
        for(int i=2;i<n;i++){
            if(!prime[i]){
                for(int j=i+i;j<n;j+=i){

                    if(!prime[j]){

                        prime[j]=true;
                        count--;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        countPrimes(n);

    }
}
