package com.kh.inherit.chpa02.model.vo.service;

import com.kh.inherit.chpa02.model.vo.Book;
import com.kh.inherit.chpa02.model.vo.JavaBook;

public class OverrideService {
	
	public void example1() {
		Book bk1 = new Book();
		
		bk1.setTitle("자바의 정석");
		bk1.setAuthor("남궁 성");
		bk1.setPrice(30000);
		
		System.out.println("book1.toString() : " + bk1.toString());
		
		System.out.println("book1 : " + bk1);
		//toString()을 오버라이딩해서 사용할 경우
		//참조변수를 출력하는 경우에
		//JVM에 의해서 컴파일 단계에서
		//자동으로 .toString()이 추가됨.
		
		//기본 자료형은 ==(같다)라는 비교연산자를 사용하여
		//값이 같은지를 비교함
		int num1 = 10;
		int num2 = 20;
		if(num1 == num2) {
			System.out.println("num1과 num2는 같다.");
		}
		
		//String 값 비교
		//String.equals.()는
		//두 문자열에서 각 문자들이 서로 같은지를 판별하도록
		//오버라이딩이 되어있음.
		String str1 = "Hello"; 
		String str2 = "Hello"; 
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같다.");
		}
		
		//equals 오버라이딩 테스트
		
		Book bk2 = new Book("자바의 정석", "남궁 성", 30000);
		
		if(bk1.equals(bk2)) {	//bk1과 bk2가 동등객체인지 비교
			System.out.println("같은 책이다.");
		}else {
			System.out.println("다른 책이다.");
		}
		
		
		Book bk3 = new Book("수학의 정석", "고은지", 20000);
		
		if(bk1.equals(bk3)) {
			System.out.println("같은 책이다.");
		}else {
			System.out.println("다른 책이다.");
		}
		
		
		System.out.println("=============================");
		
		JavaBook jb = new JavaBook();
		
		System.out.println(jb.informationTransfer());
		
		/*	바인딩(Binding)
		 * 	- 호출 되는 메소드와 실제 실행되는 메소드를 묶는 기술
		 * 
		 * 	정적 바인딩
		 * 	- 컴파일 단계에서 묶임
		 * (오버라이딩 전 메소드)
		 * 
		 * 	동적 바인딩
		 * 	- 자바프로그램 실행 중에 묶임
		 * 	(오버라이딩 한 메소드)
		 * */
		
		
		
		
		
		
	}

}
