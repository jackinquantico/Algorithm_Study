package com.jk.baekjoon;

import java.util.Scanner;

public class P2738 {

	public static void main(String[] args) {
		
		// N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하기
		// 첫째 줄에 행렬의 크기 N 과 M
		// N개의 줄에 행렬 A의 원소 M개
		// 이어서 N개의 줄에 행렬 B의 원소 M개
		// N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 첫번째 행렬을 입력받을 배열 a
		int[][] a = new int[n][m];
		
		// 첫번째 행렬과 두번째 행렬의 합을 입력할 배열 b
		int[][] b = new int[n][m];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				b[i][j] = a[i][j] + sc.nextInt();
			}
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				System.out.print(b[i][j] + " ");
			}
		}
		
		// 37132kb, 668ms 소요
	}
}
