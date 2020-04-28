package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
			float korean = sc.nextFloat();
			
		System.out.print("영어 : ");
			float english = sc.nextFloat();		
		
		System.out.print("수학 : ");
			float math = sc.nextFloat();
			
		System.out.print("\n\n");
		
		
		//출력
		System.out.println("총점 : " + (int)(korean+english+math));
		System.out.println("평균 : " + (int)(korean+english+math)/3);
		
		
		
		
		
		
		
		
		
	}
	
	

}
