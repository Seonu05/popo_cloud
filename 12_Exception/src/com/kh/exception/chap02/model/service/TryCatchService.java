package com.kh.exception.chap02.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchService {
	
	//try : 예외가 발생할 가능성이 있는 코드를 블록 내에 작성하고 시도
	//catch : try에서 던져지는 예외를 잡아서 처리하는 구문
	//finally : try~catch구문 수행 후 마지막에 반드시 실행해야하는 코드를 작성하는 부분

	public void example1() {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		try {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("프로그램 종료.");
		}
	}
	
	
	public void example2() {
		
		String[] arr = {"파스타", "백반", "돈까스", null, "칼국수"};
		
		int i = 0;
		while(true){
			try {
			System.out.println(arr[i++].charAt(0));
			}
			/*catch(RuntimeException e){
				//부모 타입의 예외처리(catch)를 자식보다 먼저 작성하면
				//try 구문에서 발생하여 전달되는 Exception 객체를
				//다 잡아서 처리하는 상황이 발생하여
				//이후에 작성된 자식 타입 예외 처리(catch)는 동작하지 못하는 문제 발생
				//  --> (해결 방법) 부모 타입 예외처리 코드를 자식 이후에 작성한다. 
				System.out.println("코드 실행 중 예외 발생");
			}*/
			
			catch(NullPointerException e) {
				System.out.println("참조값이 없습니다.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 범위를 넘어서는 영역을 참조하였습니다.");
				break;
			}catch(RuntimeException e){
				System.out.println("코드 실행 중 예외 발생");
			}
		}
		
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		//String menu = null;
		do {
			
			System.out.println("===== 메뉴 =====");
			System.out.println("1. example1() 호출");
			System.out.println("2. example2() 호출");
			System.out.println("9. 프로그램 종료");
			System.out.print("선택 >>");
			
			try {
				menu = sc.nextInt();
				
			
				switch(menu) {
				case 1 : example1(); break;
				case 2 : example2(); break;
				case 9 : System.out.println("종료합니다."); break;
				default : System.out.println("다시 입력해주세요.");
				}
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력해 주세요.");
				sc.nextLine();
			}catch(Exception e) {
				//모든 예외를 잡겠다.
				System.out.println("발생된 예외 처리");
				break;
			}
			
			//java.util.InputMismatchException
			//Scanner를 이용하여 데이터 입력 시
			// 입력 자료형이 불일치 하는 경우에 발생
		
		}while(menu !=9/*!menu.equals("9")*/);
	}
	
	public void example4() {
		//두 정수를 입력받아 나눈 몫 구하기
		//단, BufferdReader 사용하기
		
		BufferedReader br = null;
		//넓은 범위로 선언해 try, catch,finally 모두에 사용가능하게 함
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력1 : ");
			int num1 = Integer.parseInt(br.readLine()); // 
			
			System.out.print("입력2 : ");
			int num2 = Integer.parseInt(br.readLine());
			
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			
		}catch(IOException e) {
			e.printStackTrace();
			//예외가 발생한 시점의 스택구조와 예외 발생 코드의 위치를 출력
			// -->예외 처리 전 consol에 출력되던 에러 내용과 같음
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(NumberFormatException e) {
			System.out.println("정수만 입력해주세요.");
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}








