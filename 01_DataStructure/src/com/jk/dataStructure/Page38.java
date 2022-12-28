package com.jk.dataStructure;

import java.util.Scanner;

public class Page38 {

	public static void main(String[] args) {
		
		// 평균 구하기
		// 점수 중 최대값 M을 골라서 모든 점수를 점수/M*100 으로 고치기
		// 1번째 줄에 과목의 개수 N (N<=1000)
		// 2번째 줄에 현재 각 과목의 시험 성적 (0<=N<=100)
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 과목의 개수
		int[] m = new int[n]; // 과목 점수를 담을 배열
		
		// 최고 점수를 기준으로 평균을 다시 계산해야 하므로 최고점수를 담을 변수 필요함
		int maxScore = 0;
		
		// 총합 담을 변수
		int sum = 0;
		
		// 과목의 개수만큼 돌면서 과목 점수를 받기
		for (int i=0; i<n; i++) {
			m[i] = sc.nextInt();
		}
		
		// 과목의 개수만큼 돌면서 총 합과 최고 점수 구하기
		for (int i=0; i<n; i++) {
			
			// 만약 현재 입력받은 m이 최고 점수보다 크다면 값을 바꾸기
			if (m[i] > maxScore) {
				maxScore = m[i];
			}
			
			// 총 합 구하기
			sum += m[i];
		}
		
		// 과목 점수 x, y, z 가 있을 때
		// (x/M*100 + y/M*100 + z/M*100) / 3
		// = (x + y + z) * 100 / M / 3
		System.out.println(sum * 100.0 / maxScore / n);
		
		// (x + y + z) * 100.0 / M / N 를
		// (x + y + z) / M * 100.0 / N 로
		// 순서를 다르게 기입했다가 다른 결과값이 나왔음
		// => 결과에 소수점이 포함되어야 하므로 나누기 전에 실수형으로 먼저 변환해야 함
		// => (float)sum  / maxScore * 100.0 / n 로 sum 을 먼저 형변환 해주니 문제가 없음
	}

}
