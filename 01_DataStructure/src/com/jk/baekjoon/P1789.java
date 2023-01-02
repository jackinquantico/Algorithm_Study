package com.jk.baekjoon;

import java.util.Scanner;

public class P1789 {

	public static void main(String[] args) {
		
		// 서로 다른 N 개의 자연수의 합이 S 일 때
		// 자연수 N 의 최댓값은?
		// 자연수 S (1<=S<=4294967295)
		
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextLong();
		
		// 합이 s 보다 작거나 같은 동안 반복문 돌리기
		long sum = 0;
		
		// 최종 i 값을 저장할 변수
		long n = 0;
		
		for (int i=1; sum<=s; i++) {
			sum += i;
			
			if (sum <= s) {
				n = i;
			}
		}
		
		System.out.println(n);
		
		// 17752kb, 216 ms 소요
	}
}
