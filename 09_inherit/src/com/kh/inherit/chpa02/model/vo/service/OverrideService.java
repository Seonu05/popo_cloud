package com.kh.inherit.chpa02.model.vo.service;

import com.kh.inherit.chpa02.model.vo.Book;
import com.kh.inherit.chpa02.model.vo.JavaBook;

public class OverrideService {
	
	public void example1() {
		Book bk1 = new Book();
		
		bk1.setTitle("�ڹ��� ����");
		bk1.setAuthor("���� ��");
		bk1.setPrice(30000);
		
		System.out.println("book1.toString() : " + bk1.toString());
		
		System.out.println("book1 : " + bk1);
		//toString()�� �������̵��ؼ� ����� ���
		//���������� ����ϴ� ��쿡
		//JVM�� ���ؼ� ������ �ܰ迡��
		//�ڵ����� .toString()�� �߰���.
		
		//�⺻ �ڷ����� ==(����)��� �񱳿����ڸ� ����Ͽ�
		//���� �������� ����
		int num1 = 10;
		int num2 = 20;
		if(num1 == num2) {
			System.out.println("num1�� num2�� ����.");
		}
		
		//String �� ��
		//String.equals.()��
		//�� ���ڿ����� �� ���ڵ��� ���� �������� �Ǻ��ϵ���
		//�������̵��� �Ǿ�����.
		String str1 = "Hello"; 
		String str2 = "Hello"; 
		
		if(str1.equals(str2)) {
			System.out.println("str1�� str2�� ����.");
		}
		
		//equals �������̵� �׽�Ʈ
		
		Book bk2 = new Book("�ڹ��� ����", "���� ��", 30000);
		
		if(bk1.equals(bk2)) {	//bk1�� bk2�� ���ü���� ��
			System.out.println("���� å�̴�.");
		}else {
			System.out.println("�ٸ� å�̴�.");
		}
		
		
		Book bk3 = new Book("������ ����", "������", 20000);
		
		if(bk1.equals(bk3)) {
			System.out.println("���� å�̴�.");
		}else {
			System.out.println("�ٸ� å�̴�.");
		}
		
		
		System.out.println("=============================");
		
		JavaBook jb = new JavaBook();
		
		System.out.println(jb.informationTransfer());
		
		/*	���ε�(Binding)
		 * 	- ȣ�� �Ǵ� �޼ҵ�� ���� ����Ǵ� �޼ҵ带 ���� ���
		 * 
		 * 	���� ���ε�
		 * 	- ������ �ܰ迡�� ����
		 * (�������̵� �� �޼ҵ�)
		 * 
		 * 	���� ���ε�
		 * 	- �ڹ����α׷� ���� �߿� ����
		 * 	(�������̵� �� �޼ҵ�)
		 * */
		
		
		
		
		
		
	}

}
