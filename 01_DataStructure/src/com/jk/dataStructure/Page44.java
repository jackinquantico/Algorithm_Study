package com.jk.dataStructure;

import java.util.Scanner;

public class Page44 {

	public static void main(String[] args) {
		
		// 구간 합 구하기
		// 수 N개가 주어졌을 때 i번째 수에서 j번째 수까지의 합을 구하기
		// 1. 수의 개수 N(1<=N<=100000), 합을 구해야 하는 횟수 M(1<=M<=100000)
		// 2. N개의 각 수는 1000 보다 작거나 같은 자연수
		// 3. 합을 구해야 하는 구간 i, j
		
		Scanner sc = new Scanner(System.in);
		
		// 수 n 개 와, 합을 구해야 하는 횟수 m
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 합 배열 초기화
		long[] sumArr = new long[n + 1]; // n+1 로 크기를 지정해야 ArrayIndexOutOfBoundsException 발생 X
		
		for (int i=1; i<=n; i++) { // 초기식을 1 로 설정해야 ArrayIndexOutOfBoundsException 발생 X
			sumArr[i] = sumArr[i-1] + sc.nextInt();
			/*
			 * s[1] = s[0] + sc.nextInt(); // 5
			 * s[2] = s[1] + sc.nextInt(); // 5 + 4
			 * s[3] = s[2] + sc.nextInt(); // 9 + 3
			 * s[4] = s[3] + sc.nextInt(); // 12 + 2
			 * s[5] = s[4] + sc.nextInt(); // 14 + 1
			 *
			 * => s[0] 부터 s[5] 까지 배열의 크기는 n + 1만큼 필요
			 */
		}
		
		for (int a=0; a<m; a++) {
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			// 구간합 공식 : s[j] - s[i-1]
			/*
			 * 원래 배열[5] = {5,4,3,2,1}
			 * 합 배열[6] = {0, 5, 9, 12, 14, 15}
			 * 
			 * i = 1, j = 3 일 때
			 * = s[i] ~ s[j] = s[3] - s[0] = 12 - 0
			 * 
			 * i = 2, j = 4 일 때
			 * = s[i] ~ s[j] = s[4] - s[1] = 14 - 5 = 9
			 */
			
			System.out.println(sumArr[j] - sumArr[i-1]);
		}
	}
}
