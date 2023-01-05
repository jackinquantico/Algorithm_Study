package com.jk.programmers;

public class P120830 {

    public int solution(int n, int k) {
        int answer = 0;
        
        while (n / 10 != 0) {
            answer += 10 * 12000;
            n -= 10;
            k--;
        }
        
        return answer + n * 12000 + k * 2000;
    }
}
