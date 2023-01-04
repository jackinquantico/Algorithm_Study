package com.jk.programmers;

public class P120585 {

    public int solution(int[] array, int height) {
        int answer = 0;
        
        for (int i: array) {
            if (i > height) answer++;
        }
        
        return answer;
    }
}
