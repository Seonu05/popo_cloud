package com.kh.control.chap02.service;

import java.util.Scanner;

public class A_For {
	/* for문
	 * 
	 * [표현식]
	 * for(초기식 ; 조건식; 증감식){ 
	 * 
	 * }
	 * 
	 * 
	 * */
	
	public void example1() {
		// 1부터 5까지 출력하기
		
		//	   	초기식 ;	  조건식 ; 증감식
		for(int i = 1; i <= 5 ; i++ ) {
			System.out.println(i);
			
		}
	}
	
	public void example2() {
		// 5부터 1까지 출력하기
		
		//	   	초기식 ;	  조건식 ; 증감식
		for(int i = 5; i >= 1 ; i-- ) {
			System.out.println(i);
			
		}
	}
	
	
	public void example3() {
		//1부터 50까지 홀수 모두 출력
		
		for(int i = 1 ; i <= 50; i +=2 ) {
			System.out.println();
			//syso + (Ctrl + 스페이스바)
		}
		}
		
	public void example4() {
		//구구단 7단 출력하기
		// 7 X 1 = 7
		// 7 X 2 = 14
		// 7 X 3 = 21
		//  ...
		
		int dan = 7;
		
		for(int i=1 ; i<=9 ; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
			
		}
		
	}
	
	public void example5() {
		//정수를 하나 입력받아
		//해당 수가 2~9 사이 수인지 검사하여 
		//맞을 경우 해당 단의 구구단 출력하기
		// 아닐 경우 "2~9 사이의 수를 입력하세요 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		
		int dan = sc.nextInt();
		sc.nextLine();
		
		if(dan >=2 && dan <= 9) {
			
			for(int i = 1; i<10 ; i++){
				
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
				
			}
			
			
		}else {
			
			System.out.println("2~9 사이의 수를 입력하세요.");
		}
			}
	
	
	
		public void example6() {
			//1~100까지의 합
			
			int sum = 0;
			//1~100까지의 숫자의 합을 저장할 변수 sum 선언
			//선언과 동시에 0으로 초기화
			for(int i=1 ; i<=100 ; i++) {
				sum += i; //i = sum+i
				
			}
			System.out.println(sum);
			
			
		}
		

	public void example7() {
		//1부터 입력받은 정수까지의 합
		//단, 입력하는 수는 1을 초과한 수 이여야함
		//1 이하 수 입력 시 "잘못 입력하셨습니다"출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
				
		if(num > 1) {
			
			int sum = 0 ;
			
			for(int i=1; i<=num; i++) {
				
				sum += i; //sum = sum+i
			}
			System.out.println(sum);
		}else {
			
			System.out.println("잘못입력하셨습니다");
		}
	
	}
	
	public void example8() {
		//중첩 for문(이중 for문)
		
		//1부터5까지 출력되는 문장을 5줄 출력하기
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i =1; i <=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();			
		}
		
	}
	
	public void example9() {
		//0분 0초 부터 9분 59초
		
		for(int min = 0; min <= 9; min++) { //분
			
			for(int sec=0; sec<60; sec++) {
				
				System.out.printf("%2d분 %2d초\n", min,sec);
				
			}
			
		}
		
	}
	
	public void example10() {
		
		for(int dan=2; dan<=9; dan++) {
			
			for(int su=1; su<=9; su++) {
				System.out.printf("%2d X %2d = %2d", dan, su, dan*su);
			}			
			System.out.println();
		}
	}
		public void example11() {
			//별찍기(*)
			
			//*****
			//*****
			//*****
			//*****
			//*****
			
			for(int i=0; i<5; i++) { //행
				
				for(int j=0; j<5; j++) {
					
					System.out.print("*");
					
				}System.out.println();
				
			}
			
		}
		
		
		public void example12() {
			
			//*
			//**
			//***
			//****

			for(int i=0; i<4; i++) {
				
				for(int j=0; j <= i; j++) {
					System.out.print("*");
					
				}
				System.out.println();
			}
			
		}
		
	}
	
	










