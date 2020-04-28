package com.yedam;

public class EvenSumExample {
    public static void main(String[] agrs) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);
        sum = 0;
        for (int j = 1; j < 101; j++) {
        if (j % 2 == 0 || j % 3 == 0) {
            System.out.println(j);
        }
        
        }
        System.out.println(sum);
    }

}