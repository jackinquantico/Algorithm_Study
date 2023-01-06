package com.jk.programmers;

public class P120822 {

    public String solution(String my_string) {
        
        char[] charr = my_string.toCharArray();
        
        for (int i=0; i<charr.length / 2; i++) {
            char temp = charr[i];
            charr[i] = charr[charr.length -1 - i];
            charr[charr.length - 1 - i] = temp;
        }
        
        String answer = String.valueOf(charr);
        return answer;
    }
}
