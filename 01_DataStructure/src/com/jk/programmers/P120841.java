package com.jk.programmers;

public class P120841 {

    public int solution(int[] dot) {
        
        return dot[0] > 0 && dot[1] > 0 ? 1 : (dot[0]>0 && dot[1]<0 ? 4 : (dot[0]<0 && dot[1]>0 ? 2 : 3));
    }
}
