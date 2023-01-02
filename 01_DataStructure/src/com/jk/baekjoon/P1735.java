package com.jk.baekjoon;

import java.util.Scanner;

public class P1735 {

	public static void main(String[] args) {
		
		// 첫째 줄과 둘째 줄에, 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로
		// 입력되는 네 자연수는 모두 30,000 이하
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		
		int a = a1*b2 + a2*b1;
		int b = b1*b2;
		
		// 기약분수가 될 때까지 약분하기 => 소인수분해 구현 필요
		
		/*
		if (a % 2 == 0 && b % 2 == 0) {
			a /= 2;
			b /= 2;
		} 
		
		if (a % 3 == 0 && b % 3 == 0) {
			a /= 3;
			b /= 3;
		}
		*/
		
		// 2 부터 b의 제곱근까지 반복
		// => b 가 어떤 두 인수의 곱으로 나타낼 수 있다면
		//    인수 중 하나는 반드시 b 의 제곱근보다 작거나 같다
		for (int i=2; i<=Math.sqrt(b); i++) {
			
			// 반복문 안에서 계속해서 조건문으로 검사
			// 만약 2로 나누었는데 아직 짝수라면?
			// 한 번 더 나눠줘야 하므로 while 문 사용
			while (a % i == 0 && b % i == 0) {
				a /= i;
				b /= i;
			}
		}
		
		System.out.println(a + " " + b);
		
		// 18412kb, 232ms 소요
	}

}
