package com.jk.programmers;

public class P120819 {

    public int[] solution(int money) {
        
        int coffee = money / 5500;
        money -= coffee * 5500;
        
        int[] answer = {coffee, money};
        return answer;
    }
}
