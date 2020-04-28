package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in); //입력 버퍼 사용할거얌
		
		System.out.print("가로: ");
		
			double length = sc.nextDouble();
		
		System.out.print("세로: ");
		
			double width = sc.nextDouble();
			
		System.out.print("\n\n");	
			
			
		System.out.printf("면적 : %.2f\n", (length * width));
		System.out.printf("둘레 : %.1f", ((length + width)*2));
			
		
		
	}
	

}
