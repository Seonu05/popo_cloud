package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in); //입력버퍼 사용할거야~
		
		
		System.out.print("첫 번째 정수 : ");
		
		int A = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		
		int B = sc.nextInt();
		
		System.out.print("\n\n");
		
		System.out.println("더하기  결과 : " + (A+B));
		System.out.println("빼기 결과 : " + (A-B));
		System.out.println("곱하기 결과 : " + (A*B));
		System.out.println("나누기 몫 결과 : " + (A/B));
		
		
		
		
		
		
	}
	
	
	

}
