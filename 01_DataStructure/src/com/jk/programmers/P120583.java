package com.jk.programmers;

public class P120583 {
	
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int i: array) {
            if (i==n) {
                answer++;
            }
        }
        
        return answer;
    }

}
