package com.kh.poly.chap02.ex1.model.vo;

public class Chicken extends Bird {

	@Override
	public String fly() {
		return "���� ���µ� ���� ����.";
		
		
		//Animal �������̽��� ���� ��ӹ��� �޼ҵ�
		
		
	}

	@Override
	public String breath() {
		return "�췷�� ������� ���� ����ȣ���� �Ѵ�.";
	}

	@Override
	public String eat() {
		return "���̸� �θ��� �ɾƸԴ´�";
	}

}
