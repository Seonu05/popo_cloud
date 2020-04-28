package com.kh.control.chap02.service;

import java.util.Scanner;

public class A_For {
	/* for��
	 * 
	 * [ǥ����]
	 * for(�ʱ�� ; ���ǽ�; ������){ 
	 * 
	 * }
	 * 
	 * 
	 * */
	
	public void example1() {
		// 1���� 5���� ����ϱ�
		
		//	   	�ʱ�� ;	  ���ǽ� ; ������
		for(int i = 1; i <= 5 ; i++ ) {
			System.out.println(i);
			
		}
	}
	
	public void example2() {
		// 5���� 1���� ����ϱ�
		
		//	   	�ʱ�� ;	  ���ǽ� ; ������
		for(int i = 5; i >= 1 ; i-- ) {
			System.out.println(i);
			
		}
	}
	
	
	public void example3() {
		//1���� 50���� Ȧ�� ��� ���
		
		for(int i = 1 ; i <= 50; i +=2 ) {
			System.out.println();
			//syso + (Ctrl + �����̽���)
		}
		}
		
	public void example4() {
		//������ 7�� ����ϱ�
		// 7 X 1 = 7
		// 7 X 2 = 14
		// 7 X 3 = 21
		//  ...
		
		int dan = 7;
		
		for(int i=1 ; i<=9 ; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
			
		}
		
	}
	
	public void example5() {
		//������ �ϳ� �Է¹޾�
		//�ش� ���� 2~9 ���� ������ �˻��Ͽ� 
		//���� ��� �ش� ���� ������ ����ϱ�
		// �ƴ� ��� "2~9 ������ ���� �Է��ϼ��� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		
		int dan = sc.nextInt();
		sc.nextLine();
		
		if(dan >=2 && dan <= 9) {
			
			for(int i = 1; i<10 ; i++){
				
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
				
			}
			
			
		}else {
			
			System.out.println("2~9 ������ ���� �Է��ϼ���.");
		}
			}
	
	
	
		public void example6() {
			//1~100������ ��
			
			int sum = 0;
			//1~100������ ������ ���� ������ ���� sum ����
			//����� ���ÿ� 0���� �ʱ�ȭ
			for(int i=1 ; i<=100 ; i++) {
				sum += i; //i = sum+i
				
			}
			System.out.println(sum);
			
			
		}
		

	public void example7() {
		//1���� �Է¹��� ���������� ��
		//��, �Է��ϴ� ���� 1�� �ʰ��� �� �̿�����
		//1 ���� �� �Է� �� "�߸� �Է��ϼ̽��ϴ�"���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
				
		if(num > 1) {
			
			int sum = 0 ;
			
			for(int i=1; i<=num; i++) {
				
				sum += i; //sum = sum+i
			}
			System.out.println(sum);
		}else {
			
			System.out.println("�߸��Է��ϼ̽��ϴ�");
		}
	
	}
	
	public void example8() {
		//��ø for��(���� for��)
		
		//1����5���� ��µǴ� ������ 5�� ����ϱ�
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i =1; i <=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();			
		}
		
	}
	
	public void example9() {
		//0�� 0�� ���� 9�� 59��
		
		for(int min = 0; min <= 9; min++) { //��
			
			for(int sec=0; sec<60; sec++) {
				
				System.out.printf("%2d�� %2d��\n", min,sec);
				
			}
			
		}
		
	}
	
	public void example10() {
		
		for(int dan=2; dan<=9; dan++) {
			
			for(int su=1; su<=9; su++) {
				System.out.printf("%2d X %2d = %2d", dan, su, dan*su);
			}			
			System.out.println();
		}
	}
		public void example11() {
			//�����(*)
			
			//*****
			//*****
			//*****
			//*****
			//*****
			
			for(int i=0; i<5; i++) { //��
				
				for(int j=0; j<5; j++) {
					
					System.out.print("*");
					
				}System.out.println();
				
			}
			
		}
		
		
		public void example12() {
			
			//*
			//**
			//***
			//****

			for(int i=0; i<4; i++) {
				
				for(int j=0; j <= i; j++) {
					System.out.print("*");
					
				}
				System.out.println();
			}
			
		}
		
	}
	
	










