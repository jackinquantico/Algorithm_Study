package com.jk.programmers;

public class P120808 {
	
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = {denum1 * num2 + denum2 * num1, num1 * num2};
        
        for (int i=2; i<=Math.sqrt(answer[1]); i++) {
            while (answer[0] % i == 0 && answer[1] % i == 0) {
                answer[0] /= i;
                answer[1] /= i;
            }
        } 
        
        return answer;
    }

}
