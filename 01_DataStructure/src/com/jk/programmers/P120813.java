package com.jk.programmers;

public class P120813 {

    public int[] solution(int n) {
        
        int[] answer = null;
        
        if (n % 2 == 0)
            answer = new int[n / 2];
        else
            answer = new int[n / 2 + 1];
        
        for (int i=0; i<answer.length; i++) {
            for (int j=0; j<=i; j++) {
                answer[i] = i + j +1;
            }
        }
        
        return answer;
    }
}
