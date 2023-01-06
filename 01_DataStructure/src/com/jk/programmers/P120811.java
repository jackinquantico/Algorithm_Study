package com.jk.programmers;

import java.util.Arrays;

public class P120811 {

    public int solution(int[] array) {
        
        Arrays.sort(array);
        
        return array[array.length / 2];
    }
}
