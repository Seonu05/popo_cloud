package com.kh.variable.controller;

import java.util.Scanner;

public class F_Scanner {
	
	//Ű����� �̸��� �Է¹޾�
	//"������ �� ȯ���մϴ�." ��� ���ڿ� ���·� ����ϱ�
	
	public void scannerEx1() {
		
		Scanner sc = new Scanner(System.in);
		//Scanner�� java���� �Է��� ���� �� �� �ֵ��� �������ִ� Ŭ������
		//java.util ��Ű���� ���� �Ǿ��ִ�.

		System.out.print("����� �̸��� �����Դϱ�?  ");
		
		String name = sc.nextLine();
		
		System.out.println(name + "�� ȯ���մϴ�.");
		
		
	}
	
	
	//�̸�, ����, ������ �Է¹޾�
	//"���������� ������,����, Ű ������.��cm�Դϴ�." ���·� ����ϱ�
	public void scannerEx2() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// -->import ������ �ۼ����� �ʰ�
		// �ٸ� Ŭ������ ������ ���
		
		System.out.print("�̸�: ");
		
		String name = sc.nextLine();
		//sc.nextLine() : Ű����� �Էµ� �� ���� ���ڿ��� (�Է¹��ۿ���) �о��.
		// + ����(\n)���� �����ؼ� �о��
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		// sc.nextInt() : Ű����� �Էµ� ���� ���� �о��. 100 0
		// + �Է� ���ۿ��� ����, ����, �ٹٲ� ���� ������ �о��.
		
		sc.nextLine(); //�Է¹��ۿ� �ִ� �ٹٲ� ����(\n) ���� �뵵
		
		System.out.print("����(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		// char(index) : ���ڿ����� index���� ���� �ϳ��� ����
		// + index�� 0���� ����
		
		
		System.out.print("Ű(cm) : ");
		double height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.printf("%s���� %d�� %c�� %.1f cm �Դϴ�.\n", name, age, gender, height);
	}

}























