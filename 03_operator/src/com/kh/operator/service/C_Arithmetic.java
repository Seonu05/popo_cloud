package com.kh.operator.service;

import java.util.Scanner;

public class C_Arithmetic {
	//Arithmetic = ���

	//��� ������
	//���� ��Ģ���꿡 %(modulars, mod)�� �߰���.
	//������(/)���� �� �ڷ����� ����
	
	// �� ������ �Է¹޾� +,-,/,% ��� ���
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ù�� ° ���� : "); //10
		
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�� ��° ���� : "); //3
		
		int num2 = sc.nextInt();
		
		System.out.println("num1 + num2 = " + (num1 + num2)); //13
		System.out.println("num1 - num2 = " + (num1 - num2)); //7
		System.out.println("num1 * num2 = " + (num1 * num2)); //30
		System.out.println("num1 / num2 = " + (num1 / num2)); //3
		System.out.println("num1 % num2 = " + (num1 % num2)); //1
		
		
	}

}
