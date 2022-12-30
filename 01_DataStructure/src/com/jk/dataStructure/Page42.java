package com.jk.dataStructure;

public class Page42 {
	
	/*
	 * * 구간 합 : 합 배열을 이용해 시간 복잡도를 줄이기 위해 사용하는 알고리즘
	 * 
	 * * 합 배열 : 기존의 배열을 전처리한 배열
	 * - 미리 구해두면 기존 배열의 일정 범위의 합을 구하는 시간 복잡도가 O(N) -> O(1) 로 감소
	 * - 배열 A가 있을 때 합 배열 S 는
	 * 	 S[i] = A[0] + A[1] + ... + A[i] // A[0] 부터 A[i] 까지의 합
	 * 
	 * * 합 배열을 만드는 공식
	 * - S[i] = S[i-1] + A[i]
	 * 	  예) S[5] = A[0] + A[1] + A[2] + A[3] + A[4] + A[5]
	 * 			 = S[5-1] + A[5]
	 * 
	 * * 구간 합을 구하는 공식
	 * - i에서 j까지 구간합 : S[j] - S[i-1]
	 * 	  예) 배열 A[2] ~ A[5] 구간 합
	 * 		S[5] = A[0] + A[1] + A[2] + A[3] + A[4] + A[5] 에서
	 * 		A[2] + A[3] + A[4] + A[5] 부분만 남기려면
	 * 		합배열 S[5] 에서 A[0] + A[1], 즉 S[1] 을 빼면 쉽게 구할 수 있음
	 */

}