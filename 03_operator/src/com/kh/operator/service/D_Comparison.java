package com.kh.operator.service;

public class D_Comparison {
	//�� ������(���� ������)
	/* - �� ��(���� �Ǵ� ����)�� ����ϴ� ������
	 * - �� ������ ������ �����ϸ� true, �ƴϸ� false�� ��ȯ��.
	 * 
	 *  int a=10, b=20;
	 *  a<b;	--> �ڵ� ��ü�� true�� ��ȯ�� --> ��ȯ
	 *  
	 *  
	 *  <	ex) a < b 	b�� a���� ū��?(�ʰ�), a�� b���� ������?(�̸�) 
	 *  >	ex) a > b 	b�� a���� ū��?(�ʰ�), a�� b���� ������?(�̸�)	
	 *  <=	ex) a <= b 	b�� a���� �۰ų� ������?(����)
	 *  >=	ex) a >= b 	b�� a���� ũ�ų� ������?(�̻�)
	 *  == 	ex) a == b	a�� b�� ������?
	 *  !=	ex) a != b	a�� b�� �ٸ���?
	 *  
	 *  tip. ���� ��ȣ���� '='�� ������ �������̴�.
	 *  
	 * */
	
	public void example1() {
		
		int num1 = 10; 
		int num2 = 25;
		// int num1 = 10, num2 = 25;
		
		
		//���� �ڷ��� ���� ���� �� ���ٷ� ���� ����
		//������ ���ʻ� ���� ����.(�Ⱦ��ϴ� ����鵵 ����)
		//�� ���� ���忡�� �ϳ��� �ǹ̸��� ������ �ۼ��ϴ� ���� ����.
		
		boolean result1,result2,result3;
		
		result1 = (num1 == num2); // F
		result2 = (num1 <= num2); // T
		result3 = (num1 > num2); // F
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		// %, == or != �� �̿��Ͽ�
		// Ȧ��, ¦��, ��� �Ǻ�
		
		
		int a = 5;
		System.out.println("a�� ¦�� �ΰ�? " + (a % 2 == 0));
		System.out.println("a�� ¦�� �ΰ�? " + (a % 2 != 1));
		
		
		System.out.println("a�� Ȧ�� �ΰ�? " + (a % 2 == 1));
		System.out.println("a�� Ȧ�� �ΰ�? " + (a % 2 != 0));
		
		System.out.println("a�� 5�� ��� �ΰ�? " + (a % 5 == 0));
		
		
	}
	
	
	
	
	
}












