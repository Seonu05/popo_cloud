package com.kh.control.chap03.service;

public class B_Continue {
	   
	   // continue
	   // - �ݺ��� �������� ��� ������ �����
	   // - �ڵ� ���� �� continue�� ������ �Ǹ� 
	   //   ���� ������ �������� �ʰ� �ݸ� ó������ ���ư�.
	   // - ó������ ���ư� �� �������� ������ �̸� ������.
	   
	   public void example1() {
	      // 1 ~ 100 ������ ���� �� 4�� ����� �����ϰ�
	      // ������ ������ ���� ���Ͽ���(continue)
		   
		   int sum = 0; 
		   
		   for(int i=1; i<=100; i++){
			   
			   if(i % 4 == 0) {//4�ǹ�� ����
				   continue;				   
				  }
			   
			   sum +=i;
			   
		   }
		   
		   System.out.println("sum : " + sum);
	   }
	   
	   public void example2() {
		   //2~9�� ������ ���
		   //��,3����,6��,9���� ������� ����.
		   
	  
		   for(int i=2; i<9; i++) {
			   if(i % 3 == 0) {
				  continue;
			   }
			 for(int j=1; j<=9; j++) {
				 System.out.println(i+"*"+ j + "=" + i*j);				 
			 }
			  
			  
		   }
	   }

	}