package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in); //�Է� ���� ����Ұž�
		
		System.out.print("����: ");
		
			double length = sc.nextDouble();
		
		System.out.print("����: ");
		
			double width = sc.nextDouble();
			
		System.out.print("\n\n");	
			
			
		System.out.printf("���� : %.2f\n", (length * width));
		System.out.printf("�ѷ� : %.1f", ((length + width)*2));
			
		
		
	}
	

}
