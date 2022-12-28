package com.jk.dataStructure;

import java.util.Scanner;

public class Page35 {

	public static void main(String[] args) {
		
		// 숫자의 합 구하기
		// 1번째 줄에 숫자의 개수 N (1<=N<=100)
		// 2번째 줄에 숫자 N개가 공백 없이 주어질 때
		// 입력으로 주어진 숫자 N개의 합 출력하기
		
		// 입력을 위한 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 숫자의 개수 N개 입력받기
		int n = sc.nextInt();
		
		// 공백 없이 주어지는 숫자 N개를 문자열로 받고 -> 문자 배열로 변환 -> 숫자로 변환해야 함
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray(); // toCharArray() : 문자열을 각각 문자 배열로 변환
		
		// 숫자의 합을 담아둘 변수 선언 및 초기화
		int sum = 0;
		
		for (int i=0; i<cNum.length; i++) {
			sum += cNum[i] - '0'; // 아스키코드 : '0' 을 빼거나 숫자 48을 빼거나
		}
		
		System.out.println(sum);
	}

}
