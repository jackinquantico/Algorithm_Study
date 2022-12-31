package com.jk.dataStructure;

import java.util.Scanner;

public class Page47 {

	public static void main(String[] args) {
		
		// 구간합 구하기
		// N x N 개의 수가 N x N 크기의 표에 채워져있을 때
		// X = 행, Y = 열
		// 표 안의 수 중 (X1, Y1) 에서 (X2, Y2) 까지의 합을 구하기

		// N : 표의 크기, M : 합을 구해야 하는 횟수
		// (1<=N<=1024, 1<=M<=100000)
		// N 개의 줄에 표에 채워져있는 수가 1행부터 차례로 주어짐
		// M 개의 줄에 구해야하는 구간합 X1, Y1, X2, Y2 가 주어짐
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 원본 배열을 저장할 공간 만들기
		int[][] a = new int[n+1][n+1];
		
		// 원본 배열 저장하기
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				
				a[i][j] = sc.nextInt();
			}
		}
		
		// 합 배열 저장할 공간
		long[][] s = new long[n+1][n+1];
		
		// 합 배열 구하기
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				
				/*
				 * 1 2 3 4 배열에서 합 배열을 구하려면
				 * 2 3 4 5
				 * 3 4 5 6
				 * 4 5 6 7
				 * 
				 * 1 3
				 * 3 8 => s[0][1] + s[1][0] - s[0][0] + a[1][1]
				 *     => 3 + 3 - 1 + 3 = 8
				 *     
				 * 의 공식에 따라서
				 * 
				 * 1  3  6  10
				 * 3  8  15 24
				 * 6  15 27 42
				 * 10 24 42 64 가 된다
				 */
				s[i][j] = s[i][j-1] + s[i-1][j] - s[i-1][j-1] + a[i][j];
			}
		}
		
		for (int i=0; i<m; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			/*
			 * 1 2 3 4 배열에서
			 * 2 3 4 5
			 * 3 4 5 6
			 * 4 5 6 7
			 * 
			 * [2][2]~[3][4] 구간합을 구하려면
			 * =>
			 * 3 4 5
			 * 4 5 6 부분
			 * 
			 * 1 2 3 4		1 2 3 4 		1			 1
			 * 2 3 4 5						2
			 * 3 4 5 6 에서  			를 빼고     3 을 뺀 뒤에 다시   을 한 번 더해주면 됨
			 * 
			 * => [2][2]~[3][4] = [3][4] - [2-1][4] - [3][2-1] + [2-1][2-1]
			 */
			
			System.out.println(s[x2][y2] - s[x1 - 1][y2] - s[x2][y1 - 1] + s[x1 - 1][y1 - 1]);
		}
	}

}
