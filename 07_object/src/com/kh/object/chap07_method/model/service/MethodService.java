package com.kh.object.chap07_method.model.service;

import com.kh.object.chap07_method.model.vo.TV;

public class MethodService {
	public void example1() {
		
		//TV ��ü �ϳ� ����
		TV t1 = new TV("LCD",false,220);
		TV t2 = new TV("OLED",true,220);
		
		t1.voltage = 400;
		
		System.out.println(t1.voltage);
		System.out.println(t2.voltage);
		
		// ���� �Ǵ� �޼ҵ�� 
		// static ���� �Ҵ� �� ��
		// Ŭ������. ������(or �޼ҵ��)���� �Ҵ��.
		System.out.println(TV.voltage);
		TV.voltage = 220;
		System.out.println(TV.voltage);
		
		TV.test();
	}

}
