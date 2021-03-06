package com.kh.operator.service;

public class F_Compound {
	//복합 대입 연산자
	// - 다른 연산자와 대입 연산자를 함께 사용하는 연산자
	// - 자기 자신과 연산 후 결과를 다시 자신에게 대입
	

	// ex)
	// int a = 10;
	// a += 10;  ==  a = a + 10;
	// a= 20;
	
	//복합 대입 연산은 연산 처리 속도가 훨씬 빠르므로 사용 권장.
	
	public void example1() {
		int num = 12;
		
		//num을 3증가 시키기
		num += 3;
		System.out.println("num 3 증가 : " + num);
		
		//num을 5감소 시키기
		num -= 5;
		System.out.println("num을 5 감소 시키기 : " + num);
		
		//num을 6배 증가 시키기
		num *= 6;
		System.out.println("num을 6배 증가시기키 : " + num);
		
		//num을 1/2배 감소 시키기
		num /= 2;
		System.out.println("num을 1/2배 감소시키기 : " + num);
		
		// num을 4로 나눴을 때 나머지
		num %= 4;
		System.out.println("num을 4로 나눴을 때 나머지 : " + num);
	}
	
	
	
	
}











