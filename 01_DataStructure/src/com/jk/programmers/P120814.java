package com.jk.programmers;

public class P120814 {

    public int solution(int n) {
        return  n % 7 == 0 ? n / 7 : (n / 7 + 1);
    }
}
