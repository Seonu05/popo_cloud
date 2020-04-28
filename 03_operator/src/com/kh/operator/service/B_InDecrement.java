package com.kh.operator.service;

public class B_InDecrement {
	
	//증감 연산자
	//  - 피연산자를 1증가 또는 감소 시키는 연산자
	//	- 피연산자 : 연산을 당하는 수 또는 변수
	
	// ++(1증가), -- (1감소)
	
	// 전위 연산자 : 먼저 증감 연산 실행 후 다른 연산 진행 
	
	// 후위 연산자 : 다른 연산 진행 후 증감 연산 진행
	
	
	public void example() {
		//전위 증감 연산자 테스트
		
		int num = 10;
		
		System.out.println("증감 연산자 적용 전 : " + num); //10
		System.out.println("++num 1회 수행 후 : " + (++num)); //11
		System.out.println("++num 2회 수행 후 : " + (++num));
		System.out.println("++num 3회 수행 후 : " + (++num));
		System.out.println("++num 4회 수행 후 : " + (++num));
		System.out.println("++num 5회 수행 후 : " + (++num));
		
		System.out.println("증감 연산자 적용 후 : " + num);
		
		
		//경계선 출력 
		System.out.println("\n--------------------------------\n");
		
		
		//후위 증감 연산자 테스트
		
		int num2 = 10;
		
		System.out.println("후위 증감 연산자 적용 전 : " + num2); //10
		System.out.println("num2-- 1회 수행 후 : " + (num2--));
		// 출력 : 10 , num2 = 9
		System.out.println("num2-- 2회 수행 후 : " + (num2--));
		System.out.println("num2-- 3회 수행 후 : " + (num2--));
		System.out.println("num2-- 4회 수행 후 : " + (num2--));
		System.out.println("num2-- 5회 수행 후 : " + (num2--));
		
		System.out.println("후위 증감 연산자  적용 후 : " + num2);
		
		
		
	}
	
	
	public void example2() {
		
		int num1 = 20;
		
		int result = num1++ *3;
		
		System.out.println("num1 : " + num1);
		System.out.println("result : " + result);
		
		
	}
	
	public void example3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int result1 = a++;
		// a=11, b=20, c=30, result1 = 10
		int result2 = (++a) + (b++);
		// a=12, b=21, c=30 , result2 = 32
		int result3 = (a++) + (--b) + (--c);
		// a=13, b=20, c=29 , result3 = 61
		
		System.out.println("a : " + a); //13
		System.out.println("b : " + b); //20
		System.out.println("c : " + c); //29
		
		System.out.println("result1 : " + result1); // 10
		System.out.println("result2 : " + result2); // 32
		System.out.println("result3 : " + result3); // 61
 		
 		
		
		
	}
	
	
}





















