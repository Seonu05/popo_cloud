package com.kh.control.chap02.service;

import java.util.Scanner;

public class LoopPractice {
	
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		//���� ���� ��� for��
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
