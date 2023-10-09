package com.bridgelabz;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i <100; i++) {
            if (isPrime(i)){
                System.out.print(i+",");
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num<=1){
            return false;
        }
        for (int i = 2; i <num; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;

    }
}
