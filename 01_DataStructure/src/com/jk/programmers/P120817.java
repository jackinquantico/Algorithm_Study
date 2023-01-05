package com.jk.programmers;

public class P120817 {

    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        
        for (int i: numbers) {
            sum += i;
        }
        
        return (double)sum / numbers.length;
    }
}
