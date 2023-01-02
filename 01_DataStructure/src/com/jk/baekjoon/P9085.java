package com.jk.baekjoon;

import java.util.Scanner;

public class P9085 {

	public static void main(String[] args) {
		
		// 10보다 작거나 같은 자연수 N개를 주면 합을 구하기
		// 첫 줄에는 테스트 케이스의 개수 T(1<=T<=10)
		// 자연수의 개수 N(1<=N<=100), 그 다음 줄에는 N개의 자연수

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++) {
			
			int n = sc.nextInt();
			
			int sum = 0;

			for (int j=0; j<n; j++) {
				sum += sc.nextInt();
			}
			
			System.out.println(sum);
		}
	
		// 17328kb, 216ms 소요
	}

}
