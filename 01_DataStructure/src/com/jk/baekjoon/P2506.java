package com.jk.baekjoon;

import java.util.Scanner;

public class P2506 {

	public static void main(String[] args) {
		
		// 첫째 줄에 문제의 개수 N (1 ≤ N ≤ 100)
		// 둘째 줄에는 N개 문제의 채점 결과를 나타내는 0 혹은 1이 빈 칸으로 구분 
		// 0은 문제의 답이 틀린 경우이고, 1은 문제의 답이 맞는 경우
		
		// 연속으로 문제의 답이 맞는 경우에서 두 번째 문제는 2점, 세 번째 문제는 3점, 
		// ..., K번째 문제는 K점으로 계산
		// 틀린 문제는 0점으로 계산
		
		Scanner sc = new Scanner(System.in);
		
		// 문제의 개수
		int n = sc.nextInt();
		
		// 문제 채점 결과 담을 배열 m
		int[] m = new int[n];
		
		// 누적 점수 담을 변수
		int score = 1;
		
		// 총 점수 담을 변수
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			m[i] = sc.nextInt();
			
			if (m[i] == 1) {
				if (score == 0) {
					score = 1;
				}
				m[i] = score++;
			} else {
				score = 0;
				m[i] = score;
			}
			
			sum += m[i];
		}
		
		System.out.println(sum);

		// 17840kb, 216ms 소요
	}
}
