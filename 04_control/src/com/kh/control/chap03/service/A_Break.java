package com.kh.control.chap03.service;

import java.util.Scanner;

public class A_Break {
	
	public void example1() {
		//1~10���� ��� (for�� ���, �� for���� ���ǽ��� �ۼ��ϸ� �ȵ�)
		
		for(int i=1; ; i++) {
			//for���� ���ǽ��� ���� �ݺ����� ����Ǵ� ������ �� �� ����.
			// --> ���� ����(���� �ݺ�)
			if(i>10) {
				break;
				
			}
			
			
			System.out.println(i);			
		}
		
	}

	
	public void example2() {
		//���ڿ��� �Է¹޾� ����ϱ�
		//��, exit �Է� �� ����
		
		Scanner sc = new Scanner(System.in); 
		
		String str = null; //�ԷµǴ� ���ڿ��� ������ ���� ����
		
		System.out.print("�Է� : ");
		
		while(true) { //while���� ������ ���ѹݺ� ��Ŵ
			
			str = sc.nextLine();
			System.out.println("str : " + str);
			
			if(str.equals("exit")) {
				
				break;
			}
			
		}
		
	}
}



















