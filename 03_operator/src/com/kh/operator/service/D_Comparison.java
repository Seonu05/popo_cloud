package com.kh.operator.service;

public class D_Comparison {
	//비교 연산자(관계 연산자)
	/* - 두 값(숫자 또는 변수)을 비료하는 연산자
	 * - 비교 연산자 조건을 만족하면 true, 아니면 false를 반환함.
	 * 
	 *  int a=10, b=20;
	 *  a<b;	--> 코드 자체가 true로 변환됨 --> 반환
	 *  
	 *  
	 *  <	ex) a < b 	b가 a보다 큰가?(초과), a가 b보다 작은가?(미만) 
	 *  >	ex) a > b 	b가 a보다 큰가?(초과), a가 b보다 작은가?(미만)	
	 *  <=	ex) a <= b 	b가 a보다 작거나 같은가?(이하)
	 *  >=	ex) a >= b 	b가 a보다 크거나 같은가?(이상)
	 *  == 	ex) a == b	a와 b가 같은가?
	 *  !=	ex) a != b	a와 b가 다른가?
	 *  
	 *  tip. 복합 기호에서 '='는 무조건 오른쪽이다.
	 *  
	 * */
	
	public void example1() {
		
		int num1 = 10; 
		int num2 = 25;
		// int num1 = 10, num2 = 25;
		
		
		//같은 자료형 변수 선언 시 한줄로 선언 가능
		//하지만 관례상 좋지 않음.(싫어하는 사람들도 있음)
		//한 줄의 문장에는 하나의 의미만을 갖도록 작성하는 것이 좋음.
		
		boolean result1,result2,result3;
		
		result1 = (num1 == num2); // F
		result2 = (num1 <= num2); // T
		result3 = (num1 > num2); // F
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		// %, == or != 를 이용하여
		// 홀수, 짝수, 배수 판별
		
		
		int a = 5;
		System.out.println("a는 짝수 인가? " + (a % 2 == 0));
		System.out.println("a는 짝수 인가? " + (a % 2 != 1));
		
		
		System.out.println("a는 홀수 인가? " + (a % 2 == 1));
		System.out.println("a는 홀수 인가? " + (a % 2 != 0));
		
		System.out.println("a는 5의 배수 인가? " + (a % 5 == 0));
		
		
	}
	
	
	
	
	
}












