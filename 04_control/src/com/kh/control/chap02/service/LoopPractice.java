package com.kh.control.chap02.service;

import java.util.Scanner;

public class LoopPractice {
	
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		//앞쪽 공백 출력 for문
		for(int i= 0; i<num; i++) {
			for(int k=0; k<num-1-i; k++) {
				System.out.print(" ");
			}	
				for(int j=0; j <= i; j++) {		
					System.out.print("*");				
			}		
				System.out.println();
		}				
	}
}
