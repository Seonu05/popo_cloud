package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in); //�Է¹��� ����Ұž�!
		
		
		
		System.out.print("�̸��� �Է��ϼ��� : ");
			
			String name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		
			char gender = sc.nextLine().charAt(0);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		
			int age = sc.nextInt();
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		
			double height = sc.nextDouble();
			
			sc.nextLine();
			
			
			System.out.printf("Ű %.1fcm�� %d�� %c�� %s�� �ݰ����ϴ�^^\n",height, age, gender, name );
			
			
		
	}
	
	
	
	

}
