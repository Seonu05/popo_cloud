package com.kh.operator.service;

public class B_InDecrement {
	
	//���� ������
	//  - �ǿ����ڸ� 1���� �Ǵ� ���� ��Ű�� ������
	//	- �ǿ����� : ������ ���ϴ� �� �Ǵ� ����
	
	// ++(1����), -- (1����)
	
	// ���� ������ : ���� ���� ���� ���� �� �ٸ� ���� ���� 
	
	// ���� ������ : �ٸ� ���� ���� �� ���� ���� ����
	
	
	public void example() {
		//���� ���� ������ �׽�Ʈ
		
		int num = 10;
		
		System.out.println("���� ������ ���� �� : " + num); //10
		System.out.println("++num 1ȸ ���� �� : " + (++num)); //11
		System.out.println("++num 2ȸ ���� �� : " + (++num));
		System.out.println("++num 3ȸ ���� �� : " + (++num));
		System.out.println("++num 4ȸ ���� �� : " + (++num));
		System.out.println("++num 5ȸ ���� �� : " + (++num));
		
		System.out.println("���� ������ ���� �� : " + num);
		
		
		//��輱 ��� 
		System.out.println("\n--------------------------------\n");
		
		
		//���� ���� ������ �׽�Ʈ
		
		int num2 = 10;
		
		System.out.println("���� ���� ������ ���� �� : " + num2); //10
		System.out.println("num2-- 1ȸ ���� �� : " + (num2--));
		// ��� : 10 , num2 = 9
		System.out.println("num2-- 2ȸ ���� �� : " + (num2--));
		System.out.println("num2-- 3ȸ ���� �� : " + (num2--));
		System.out.println("num2-- 4ȸ ���� �� : " + (num2--));
		System.out.println("num2-- 5ȸ ���� �� : " + (num2--));
		
		System.out.println("���� ���� ������  ���� �� : " + num2);
		
		
		
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





















