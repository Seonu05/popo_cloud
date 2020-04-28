package com.kh.operator.service;

import java.util.Scanner;

public class E_Logic {
	//�� ������
	// - �� �� �� ���� ���ϴ� ������
	// && (AND) : �� �� true �� ���� true ��ȯ
	// ---> �׸���, ~�鼭, ~�̸鼭, ~���� , ~����
	// ex) 1���� 100���� 
	// �����̸鼭 �Ȱ��� ���ź�
	
	// || (OR) : �� �� false �� ���� false ��ȯ 
	// --> �Ǵ�, ~�ų�, �̰ų�
	// ex) ����Ʈ���� �Ｚ �Ǵ� LG�̽ź�

	
	public void example1() {
		
		//����Ű : �� �� ���� -> ������ �࿡ Ŀ�� ��ġ �� ctrl + d 
		
		//�Է¹��� ������ 1~100������ �������� Ȯ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		// 1 <= input <= 100
		
		boolean result = (1 <= input ) && ( input <= 100);
		
		System.out.println("1 ���� 100 ������ ���ΰ�? " + result);
		
		
	}
	
	public void example2() {
		// �Է��� ���ĺ��� �빮��(A ~ Z)���� �˻�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		// 'A' <= ch <= 'Z'
		// char �ڷ����� ���� ����Ǵ� ���� ����
		// A~Z�� 65���� 1�� �����ϸ鼭 ������� �����Ǿ�����.
		
		boolean result = (ch >= 'A') && (ch <= 'Z');
		
		System.out.println("���� �빮�� Ȯ�� : " + result);
		
	}
	
	public void example3() {
		// �Է¹��� ���ĺ��� Y���� �˻�(��ҹ��� ���� ����)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ĺ� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		
		System.out.println("���ĺ� Y���� Ȯ�� : " + result);
		
		
		
	}

	public void example4() {
		// ���� + ��� + �� + ��
		
		int a = 2;
		int b = 3;
		
		boolean c = a > b;
				//	2 > 3
		boolean d = ++a <= b++;
  				  // 3 <= 3
		
		//a=3, b=4, c=false, d=true
		
		System.out.println("a : " +a); //3
		System.out.println("b : " +b); //4
		System.out.println("c : " +c); //f
		System.out.println("d : " +d); //t
		
		System.out.println();
		
		System.out.println("!c : " + !c); //t
		System.out.println("c != d : " + (c != d)); //t
		
		System.out.println();
		
		System.out.println("(a % b) == 1 : " + ((a % b) == 1)); //f 
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4))); //t 
		System.out.println("!d || (a-b) > 0 : " + (!d || (a-b) > 0)); //f
		
		System.out.println();
		
		System.out.println("!(c == d) && ((a * b == 10) || ( b % 2 == 0)) : " + (!(c == d) && ((a * b == 10) || ( b % 2 == 0)))); 
							// t && f || t // t
		
	}
	
	
	
}












