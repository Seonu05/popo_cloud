package com.kh.operator.service;

import java.util.Scanner;

public class G_Triple {
	
	//���� ������
	//(���ǽ�) ? ��1(true) : ��2(false);
	//���ǽ��� ����� �ݵ�� true �Ǵ� false�����Ѵ�.
	// ---> �� / �� ������ ����� ��κ�
	
	public void example1() {
		//������ �Է� �޾� ������� �ƴ��� �˻��ϱ�
		// (���� == ���� ����, ���� ����, 0)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		//���� ������ 		(���ǽ�) 		?	 ��1		:	  ��2       ;
		String result = (input > 0) ? "����̴�." : "����� �ƴϴ�" ;
		
		System.out.println(input + " ��/�� " + result);
	
	}
	
	public void example2() {
		//������ �Է� �޾� ���, 0, ���� �˻��ϱ�
		//���� ������ ��ø ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		//���� ������ 		(���ǽ�) 		?	 ��1(��)		:
		String result = (input > 0) ? "����̴�." : 
									((input < 0) ? "�����̴�" : "0 �̴�." );
										//��2(����) 
									//	(���ǽ�) 	?	��1-1(��): ��1-2(����);
		System.out.println(input + " ��/�� " + result);
	
	}
	
	

}
