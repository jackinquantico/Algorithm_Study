package com.jk.programmers;

import java.util.HashSet;

public class P120903 {
    public int solution(String[] s1, String[] s2) {
        
        HashSet<String> set = new HashSet<>();
        
        for (int i=0; i<s1.length; i++) {
        	set.add(s1[i]);
        }
        
        for (int i=0; i<s2.length; i++) {
        	set.add(s2[i]);
        }
        
        return s1.length + s2.length - set.size();
    }
}
