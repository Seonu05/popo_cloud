package com.kh.variable.controller;

public class A_Variable {
	
	//������ ������� ���� ���
	public void noVariable() {
		System.out.println("���� ��� X");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
		
	}
	//������ ����� ���
	public void usingVariable() {
		double pi = 3.141592653589793; // ������
		int r = 10; //������
		int h = 20; //����
		
		System.out.println("���� ��� O");
		System.out.println(2 * pi * r); //���� �ѷ�
		System.out.println(pi * r * r); //���� ����
		System.out.println(pi * r * r * h); //�����
		System.out.println(4 * pi * r * r); //���� �ѳ���
			
		
		/*���� ����� ����
		 * 
		 * 1. ���� �ǹ̸� �ο��� �� �ִ�.
		 * 2. �������� ��������.
		 * 3. ���뼺(���Ӽ�)�� ����.
		 * 4. ������������ ����.
		 */
		
		System.out.println();
		
	}
	
	//���� ����
	public void declareVariable() {
		//1. ����
		//��(true), ����(false)�� ������ �� �ִ� �ڷ���
		boolean isTrue; //1byte
		
		//2. ������
		//2-1. ������ (��������, ���� ����, 0)
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; //4byte ---> ������ �߿� �⺻��
		long lNum; //8byte
		
		//2-2. �Ǽ���
		//�Ǽ��� �������� ���� ��� -> �ε��Ҽ��� ����� ���
		float fNum; //4byte
		//0.999999 (float)
		
		//0.9999999999999 (double) ��Ȯ���� 2��
		
		//double�� float���� ��Ȯ��(�Ҽ��� ǥ�� ����)�� 2�� ũ��(���)
		
		double dNum; //8byte ---> �Ǽ��� �߿� �⺻��
		
		//3.������
		// ������ ������ ���� �� �ϳ����� ���� �� �� �ִ�.
		char ch; //(�ڹٴ�)2byte
		
		//4.���ڿ� 
		//���ڿ��� �⺻ �ڷ����� �ƴ� --> ������
		//���ڿ��� �޸� ũ�� �Ǵ� �� ������
		String str;
		
		//23���� * 2byte = 46byte
		//1000���� * 2byte = 2000byte
		
		
		
		//-----------------------------
		
		
		
		
		// ������  ������ �� ����
		isTrue = true;  //���� 41�ٿ� ��������[boolean isTrue;] ������
		isTrue = false;
		// boolean �ڷ��� ������ ���� �� �� �ִ� ��(���ͷ�)��
		// true �Ǵ� false ���̴�.
		
		
		// ������
		bNum = 1;
		// bNum = 128;
		// 128�� byte �ڷ����� ���� ������ �Ѿ� �� ���̹Ƿ� 
		// type mismatch error�� �߻��Ѵ�.
		
		sNum = 10000;
		iNum = 2000000000;
		
		//byte , short �ڷ�����
		//���� ���α׷����� ȣȯ���� ���� ������ �ڷ�������
		//������ ���ͷ� ǥ����� �������� �ʾ�
		//int�� ���ͷ� ǥ����� ����Ѵ�.
		
		
		lNum = 123L;
		//������ long�� ���ͷ� ǥ�����
		//���� �ڿ�  l �Ǵ� L�� ǥ��
		
		
		//�Ǽ���
		fNum = 1.234f;
		//�Ǽ��� float�� ���ͷ� ǥ�����
		//�Ǽ� �ڿ� F �Ǵ� f ǥ��
		
		
		dNum = 3.141592;
		// double�� �Ǽ����� �⺻�����ν� 
		// ������ ���ͷ� ǥ����� ���� �ʰ�
		// �Ǽ� ��ü���� �ۼ���
		
		
		//������
		ch = 'A';
		// char �ڷ����� ���ͷ� ǥ����� ''(Ȧ����ǥ)
		
		str = "A";
		//String�� �ڷ��� ���ͷ� ǥ����� ""(�ֵ���ǥ)
		//�� ���ڸ� �ۼ��ص� �ֵ���ǥ�� ǥ���ؾ� �Ѵ�.
		
		
		//������ ����� �� ����ϱ�
		System.out.println("isTrue ������ ����� �� : " + isTrue); //true
									//isTrue ������ ����� �� : True
		System.out.println("bNum ������ ����� �� : "  + bNum);
		System.out.println("sNum ������ ����� �� : "  + sNum);
		System.out.println("iNum ������ ����� �� : "  + iNum);
		System.out.println("lNum ������ ����� �� : "  + lNum);
		
		
		System.out.println("fNum ������ ����� �� : "  + fNum);
		System.out.println("dNum ������ ����� �� : "  + dNum);
		
		System.out.println("ch ������ ����� �� : " + ch);
		System.out.println("str ������ ����� �� : "  + str);
		
	
		
		
		// �������� �ѱ۵� �����ϴ�?!
		int ��Ʈ;
		��Ʈ = -100;
		
		System.out.println("��Ʈ ������ ���� �� �� : " + ��Ʈ);
		
		System.out.println();
		
		
	}	
	
	//���� ����� ���ÿ� �ʱ�ȭ
	public void initVariable() {
		//init : �ʱ�ȭ
		
		
		//1. ����
		boolean isTrue = false;
		
		//2. ������
		byte bNum = 1; //1byte
		short sNum = 2; //2byte
		int iNum = 4; //4byte, ����(�ڷ�)�� ���� �⺻��
		long lNum = 8L; //8byte
		
		
		//3. �Ǽ���
		float fNum = 4.0f; //4byte
		double dNum = 8.0; //8byte, �Ǽ�(�ڷ�)���� �⺻��

		//4. ������ 
		char ch = '��';
		
		//5. ���ڿ�(������)
		String str = "A������";
		
		System.out.println("isTrue�� �ʱ�ȭ �� �� : " + isTrue);
		
		System.out.println("bNum�� �ʱ�ȭ�� �� : " + bNum);
		System.out.println("sNum�� �ʱ�ȭ �� �� : " + sNum);
		System.out.println("iNum�� �ʱ�ȭ �� �� : " + iNum);
		System.out.println("lNum�� �ʱ�ȭ �� �� : " + lNum);
		
		System.out.println("fNum�� �ʱ�ȭ �� �� : " + fNum);
		System.out.println("dNum�� �ʱ�ȭ �� �� : " + dNum);
		
		System.out.println("ch�� �ʱ�ȭ �� �� : " + ch);
		
		System.out.println("str�� �ʱ�ȭ �� �� : " + str);
		
	}
	
}



















