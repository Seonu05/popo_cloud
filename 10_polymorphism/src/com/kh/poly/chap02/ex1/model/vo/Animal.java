package com.kh.poly.chap02.ex1.model.vo;

public interface Animal {
	
	//�������̽��� �ʵ�� ������ public static final
	//public static final int Soul = 1;

	//�������̽��� �ʵ�� ���������� public static final
	int SOUL = 1;
	
	//�������̽��� �޼ҵ�� ������ public abstract
	public abstract String breath();
	
	// �������̽��� �޼ҵ�� ���������� public abstract
	String eat();
	
	//�������̽��� ����ϴ� Ű����
	/*
	 * �������̽��� (�Ϲ�) Ŭ������ ��� : implements(�����ϴ�)
	 * 
	 * �������̽��� �߻� Ŭ������ ��� : implements
	 * 
	 * -->Ŭ������ �������̽� ��� �� ������ implements
	 * 
	 * �������̽��� �������̽��� ��� : extends
	 * 
	 * 
	 * */
	
}
