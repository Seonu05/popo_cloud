package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
			float korean = sc.nextFloat();
			
		System.out.print("���� : ");
			float english = sc.nextFloat();		
		
		System.out.print("���� : ");
			float math = sc.nextFloat();
			
		System.out.print("\n\n");
		
		
		//���
		System.out.println("���� : " + (int)(korean+english+math));
		System.out.println("��� : " + (int)(korean+english+math)/3);
		
		
		
		
		
		
		
		
		
	}
	
	

}
