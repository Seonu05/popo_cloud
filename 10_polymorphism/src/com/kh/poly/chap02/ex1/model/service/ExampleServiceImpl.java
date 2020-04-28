package com.kh.poly.chap02.ex1.model.service;

import java.util.Scanner;

public class ExampleServiceImpl implements ExampleService {
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public String javaFeatures() {
		return "<<java의 특징>> \n"
				+ "1. 운영체제에 독립적(이식성이 높음)\r\n" + 
				"2. 객체 지향 언어\r\n" + 
				"3. 사용하기 쉬운 언어\r\n" + 
				"- 능률적이고 명확한 코드 작성 가능\r\n" + 
				"- 다른 언어의 단점 보완(포인터, 메모리 관리)\r\n" + 
				"4. 자동 메모리 관리(Garbage Collection)\r\n" + 
				"5. 동적 로딩 지원\r\n" + 
				"6. 멀티쓰레드 지원\r\n" + 
				"7. 네트워크와 분산환경 지원";
	}

	@Override
	public String defineInheritance() {
		return "<<상속의 정의>> \n다른 클래스가 가지고 있는 멤버(필드, 메소드)들을 새로 작성할 클래스에서 직접 만들지 않고\r\n" + 
				"상속을 받음으로써 새 클래스가 자신의 멤버처럼 사용할 수 있는 기능";
	}

	@Override
	public String definePolymorphism() {
		return "<<다형성의 정의>>\n"
				+ "객체지향 프로그래밍의 3대 특징 중 하나로 ‘여러 개의 형태를 갖는다’는 의미\r\n" + 
				"하나의 행동으로 여러 가지 일을 수행하는 개념\r\n" + 
				"상속을 이용한 기술로 부모 클래스 타입 참조변수 하나로\r\n" + 
				"상속 관계에 있는 여러 타입의 자식 객체를 참조할 수 있는 기술";
	}

	@Override
	public String defineAbstractClass() {
		return "<<추상 클래스의 정의>>\n"
				+ "몸체없는 메소드를 포함한 클래스";
	}

	@Override
	public String defineInterface() {
		return "<<인터페이스의 정의>>\n"
				+ "상수형 필드와 추상 메소드만을 작성할 수 있는 추상 클래스의 변형체\r\n" + 
				"메소드의 통일성을 부여하기 위해 추상 메소드만 따로 모아놓은 것으로\r\n" + 
				"상속 시 인터페이스 내에 정의된 모든 추상메소드 구현해야 함";
	}

	@Override
	public String gugudan(int start, int end) {
		
			start = sc.nextInt();
			end = sc.nextInt();
			
			
		
		
		
		
		
		return "" ;
	}

	@Override
	public String reverseStar(int input) {
		return null;
	}

}
