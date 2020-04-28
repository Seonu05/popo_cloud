package com.kh.control.chap01.practice;

import java.util.Scanner;

import com.kh.control.chap01.service.A_If;


public class ControlPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 입력 \n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n");
	
		System.out.print("메뉴 번호를 입력하세요 :");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("입력 메뉴입니다."); break;
		case 2 : System.out.println("수정 메뉴입니다."); break;
		case 3 : System.out.println("조회 메뉴입니다."); break;
		case 4 : System.out.println("삭제 메뉴입니다."); break;
		case 7 : System.out.println("프로그램이 종료됩니다."); break;
		
		
		}
		
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
			int num1 = sc.nextInt();
			
			if(num1 >= 0) {
				
				if(num1 % 2 == 0) {
					
					System.out.println("짝수다.");
				}else {
					
					System.out.println("홀수다.");
				}
			}else {
				
				System.out.println("양수만 입력해주세요.");
			}
		
		
		
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("국어점수 : ");
			int kor = sc.nextInt();
		System.out.print("수학점수 : ");
			int math = sc.nextInt();
		System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			
		int score = kor + math + eng;
		double ave = (kor + math + eng)/3 ;
		
		if(ave >=60) {
			 if(kor >= 40 || math >= 40 || eng >= 40) {
				 System.out.println("국어 : " + kor);
				 System.out.println("수학 : " + math);
				 System.out.println("영어 : " + eng);
				 System.out.println("합계 : " + score);
				 System.out.println("평균 : " + ave);
				 System.out.println("축하합니다, 합격입니다!");
				 
			 }else {
				 System.out.println("불합격입니다.");
				 
			  } 
			}else {
				System.out.println("불합격입니다.");
			}
		
		
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
			int num1 = sc.nextInt();
			
			switch(num1){
				
			case 1: case 2: case 12:
				System.out.println(num1 + "월은 겨울입니다"); break;
				
			case 3: case 4: case 5:
				System.out.println(num1 + "월은 봄입니다"); break;
				
			case 6: case 7: case 8:
				System.out.println(num1 + "월은 여름입니다"); break;
				
			case 9: case 10: case 11:
				System.out.println(num1 + "월은 가을입니다"); break;
				
				default : System.out.println(num1 + "월은 잘못 입력된 달입니다.");
				
				
			}
		
		
	}
	
	
	public void practice5() {
		//아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		//로그인 성공 시 “로그인 성공”,
		//아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		//비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		String id = "myId";
		String password = "myPassword12";
		
		
		System.out.print("아이디 : ");
			String inputId = sc.nextLine();
			
		System.out.print("비밀번호 : ");
			String inputPassword = sc.nextLine();
			
			// *클래스도 자료형 -> 그래서 String도 자료형
			// Strinf.equals()
			//String 자료형이 가지고 있는 진짜 값들이 같은지를 비교하는 메소드
			//결과로 True 또는 false 반환
			
			if(id.equals(inputId)) {
				
				if(password.equals(inputPassword)) {
					System.out.println("로그인 성공");
					
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
					
				}
			
			}else {
				
				System.out.println("아이디가 틀렸습니다.");
			}
			
	}
	
	public void practice6(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
			String grade = sc.nextLine();
			
			switch (grade) {
			
			case "관리자" : System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
			break;
			case "회원" : System.out.println("게시글 작성, 게시글 조회, 댓글 작성 ");
			break;
			case "비회원" : System.out.println("게시글 조회");
			break;
			
			
			}
	}
	
	
	public void practice7(){
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요 : ");
			double height = sc.nextDouble();
		System.out.print("몸무게(kg)을 입력해주세요 : ");
			double weight = sc.nextDouble();
			
		double bmi = weight / (height * height);	
		
		System.out.println("bmi 지수 : " + bmi);
		
		if(bmi >= 30) {
			System.out.println("고도 비만");
		
		}else if(bmi >= 25) {
			System.out.println("비만");
			
		}else if(bmi >= 23) {
			System.out.println("과체중");
			
			
		}else if(bmi >= 18.5) {
			System.out.println("정상체중");
		
		}else {
			System.out.println("저체중");
			
			
		}
		
			
		
	}
	
	public void practice8() {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("피연산자1 입력 : ");
	      int a = sc.nextInt();
	      sc.nextLine();
	      System.out.print("피연산자2 입력 : ");
	      int b = sc.nextInt();
	      sc.nextLine();
	      System.out.print("연산자 입력(+,-,*,/,%) : ");
	      char c = sc.nextLine().charAt(0);
	      double result = 0;
	      if (a > 0 && b > 0) {
	         if (c == '+') {
	            result = (double)a + b;
	            System.out.printf("%d %c % d = %f",a,c,b,result);
	         }else if (c == '-') {
	            result = (double)a - b;
	            System.out.printf("%d %c % d = %f",a,c,b,result);
	         }else if (c == '*') {
	            result = (double)a * b;
	            System.out.printf("%d %c % d = %f",a,c,b,result);
	         }else if (c == '/') {
	            result = (double)a / b;
	            System.out.printf("%d %c % d = %f",a,c,b,result);
	         }else if (c == '%') {
	            result = (double)a % b;
	            System.out.printf("%d %c % d = %f",a,c,b,result);
	         }else { 
	            System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
	         }
	      }else {
	         System.out.println("양수가 아닙니다.");
	      }
	   }
	public void practice9(){}
	
	
	
	public void practice10(){
		
		Scanner sc = new Scanner(System.in);
		
		A_If af = new A_If();
		
		System.out.println("실행할 기능을 선택하세요 : ");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		
		System.out.println("10. if문 1번");
		
		System.out.print("선택 : ");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		
		//같은 클래스 내의 메소드 끼리는 
		//메소드명을 작성하는 것으로 호출 가능
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 10 :af.example1(); break;
		
		
		default : System.out.println("잘못 입력하셨습니다.");
		
		}
		
		
	}
	
	
	
}





















