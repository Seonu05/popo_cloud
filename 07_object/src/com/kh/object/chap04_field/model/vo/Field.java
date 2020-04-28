package com.kh.object.chap04_field.model.vo;

public class Field {
	/* �ʵ�(Field, ��� ����)
	 * 	- Ŭ���� ������ �ۼ��ϴ� ������
	 * 	���� Ŭ���� �� ��𼭵� ���(����) ����
	 * */
	private int num; //Ŭ���� ������ ����� int�� ���� == �ʵ�
	
	public void example1() {
		//�������� (Local Variable)
		// - �޼ҵ�, ������, ���(for,while,if,else,switch,case)
		// Ư���� ����({}) ���� �����Ǵ� ������
		// ���������� �ش� ���������� ��� ����.
		
		int num2 = 10; //���� ������ 10�� �ʱ�ȭ
		num = 1; //�ʵ�� Ŭ���� ���� ��𼭵��� ���� ����
	}
	
	public void example2() {
		num = 100;
		//num2 = 300; num2�� ������ ����� ������ ���� �Ұ�
	}

	//	�ʵ� ����ȭ
	// 1) ��� ����(�ν��Ͻ� ����)
	private char ch;
	private double db;
	/* ���� : new�� ���� Heap ������ ��ü(�ν��Ͻ�) ���� ��
	 * 		�޸𸮿� �Ҵ��.
	 * 
	 * �Ҹ� : ��ü�� �Ҹ� �� �Ҹ�
	 * 		--> ��ü�� ���� �Ҹ�?
	 * 			������ � ������ �������� �������� ���� ��
	 * 				GC�� ���ؼ� �Ҹ��
	 * */
	
	// 2) Ŭ���� ����(Stativ ����)
	//	- static ���� ���� �ʵ�
	public static int number;
	//���� : ���α׷� ���� �� static �޸� ������ �Ҵ��
	//�Ҹ� : ���Τѷ� ���� �� �Ҹ�


	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	//final : ��� Ű����
	//private final double PI = 3.14;
	
	//static fianal
	//final static (���� ��� ����)

	//���α׷� ������ �����Ǵ� ���
	public final static double PI = 3.141592;
	//�� public?
	//�̷��� ������ ��𼭵� ���� �����ϵ��� ���� �����ڸ� 
	//public���� �δ� ���� �Ծ����� ������ ����.
	
	
	
	
	
	
}