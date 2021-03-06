package com.kh.operator.service;

import java.util.Scanner;

public class G_Triple {
	
	//삼항 연산자
	//(조건식) ? 식1(true) : 식2(false);
	//조건식의 결과는 반드시 true 또는 false여야한다.
	// ---> 비교 / 논리 연산의 결과가 대부분
	
	public void example1() {
		//정수를 입력 받아 양수인지 아닌지 검사하기
		// (정수 == 양의 정수, 음의 정수, 0)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		//삼항 연산자 		(조건식) 		?	 식1		:	  식2       ;
		String result = (input > 0) ? "양수이다." : "양수가 아니다" ;
		
		System.out.println(input + " 는/은 " + result);
	
	}
	
	public void example2() {
		//정수를 입력 받아 양수, 0, 음수 검사하기
		//삼항 연산자 중첩 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		//삼항 연산자 		(조건식) 		?	 식1(참)		:
		String result = (input > 0) ? "양수이다." : 
									((input < 0) ? "음수이다" : "0 이다." );
										//식2(거짓) 
									//	(조건식) 	?	식1-1(참): 식1-2(거짓);
		System.out.println(input + " 은/는 " + result);
	
	}
	
	

}
