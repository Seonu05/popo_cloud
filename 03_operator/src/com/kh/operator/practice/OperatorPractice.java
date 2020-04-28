package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int A = sc.nextInt();
		sc.nextLine();
		
		String result = (A > 0) ? "양수다" : "양수가 아니다";
		
		System.out.println(result);
			
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int B = sc.nextInt();
		sc.nextLine();
		
		String result = (B > 0) ? "양수다" : ( (B == 0) ? "0이다." : "음수다");
	
		System.out.println("\n" + result);
	}

	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int C = sc.nextInt();
		sc.nextLine();
		
		String result = (C % 2 == 0) ? "짝수다" : "홀수다";
		
		System.out.println();
		System.out.println(result);
		
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
			int person = sc.nextInt();
			sc.nextLine();
			
		System.out.print("사탕 개수 : ");
			int candy = sc.nextInt();
			sc.nextLine();
			
		int result1 = candy / person;
		int result2 = candy % person;
		
		System.out.println();
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
			String name = sc.nextLine();
			
		System.out.print("학년 (숫자만) : ");
			int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
			int clas = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
			int number = sc.nextInt();
			sc.nextLine();			
		
		System.out.print("성별(M/F) : ");
			char gender = sc.nextLine().charAt(0);
			String result = (gender == 'M') ? "남학생" : "여학생";
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		 	double score = sc.nextDouble();
		 	
		System.out.print(grade + " 학년 " + clas + " 반 " + name + " " + result +" 의 성적은 " + score + "이다.");
		
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age >= 20) ? "성인" : (age <= 20 && age >=14 ) ? "청소년" : "어린이";
			
		System.out.println(result);
		
		
	}
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
			int kor = sc.nextInt();
			sc.nextLine();
		
		System.out.print("영어 : ");
			int eng = sc.nextInt();
			sc.nextLine();
		
		System.out.print("수학 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			
		 int result1 = kor + eng + math;
		 double score = result1 / 3.0;
		 String result2 = (kor >= 40) && (eng >= 40) && (math >= 40) 
				 			&& (score >= 60) ? "합격" : "불합격";
		
			
			
		System.out.println("합계 : " + result1);
		System.out.println("평균 : " + score );
		System.out.println(result2);
		
		
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 (-포함) : ");
		char name = sc.nextLine().charAt(7);
		 String result = (name == '1' ) ? "남자" : (name == '2') ? "여자" : "다시 입력해주세요";
		
		 System.out.println();
		 System.out.println(result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
			System.out.print("정수1 : ");
			 int num1 = sc.nextInt();
			 sc.nextLine();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("입력 : ");
			int a = sc.nextInt();
			sc.nextLine();
			
			String result = ((a <= num1 || a > num2 ) ? "true" : "false");
			
			System.out.println();
			System.out.println(result);
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			
		System.out.print("입력2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
		System.out.print("입력3 : ");
			int num3 = sc.nextInt();
			sc.nextLine();
			
			String result = (num1 == num2) && (num2 == num3) ? "true" : "false";
	
			System.out.println(result);
	
	}
		
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
			int A = sc.nextInt();
			sc.nextLine();
		
			double Aa = A*1.4;
			
			
			
		System.out.print("B사원의 연봉 : ");
			int B = sc.nextInt();
			sc.nextLine();
			
			double Bb = B;
			
		System.out.print("C사원의 연봉 : ");
			int C = sc.nextInt();
			sc.nextLine();
			
			double Cc = C*1.15;
		
		String a1 = "3000 이상";
		String a2 = "3000 미만";
			
			
		System.out.println();
		System.out.println("A사원 연봉/연봉+a : 2500/" + Aa);
		System.out.println(Aa >=3000 ? a1 : a2);
		
		
		System.out.println("A사원 연봉/연봉+a : 2900/" + Bb);
		System.out.println(Bb >=3000 ? a1 : a2);
		
		System.out.println("A사원 연봉/연봉+a : 2600/" + Cc);
		System.out.println(Cc >=3000 ? a1 : a2);
		
		
	}
	
	
	
	
	
}















