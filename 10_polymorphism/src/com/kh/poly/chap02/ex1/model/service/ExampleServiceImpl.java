package com.kh.poly.chap02.ex1.model.service;

import java.util.Scanner;

public class ExampleServiceImpl implements ExampleService {
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public String javaFeatures() {
		return "<<java�� Ư¡>> \n"
				+ "1. �ü���� ������(�̽ļ��� ����)\r\n" + 
				"2. ��ü ���� ���\r\n" + 
				"3. ����ϱ� ���� ���\r\n" + 
				"- �ɷ����̰� ��Ȯ�� �ڵ� �ۼ� ����\r\n" + 
				"- �ٸ� ����� ���� ����(������, �޸� ����)\r\n" + 
				"4. �ڵ� �޸� ����(Garbage Collection)\r\n" + 
				"5. ���� �ε� ����\r\n" + 
				"6. ��Ƽ������ ����\r\n" + 
				"7. ��Ʈ��ũ�� �л�ȯ�� ����";
	}

	@Override
	public String defineInheritance() {
		return "<<����� ����>> \n�ٸ� Ŭ������ ������ �ִ� ���(�ʵ�, �޼ҵ�)���� ���� �ۼ��� Ŭ�������� ���� ������ �ʰ�\r\n" + 
				"����� �������ν� �� Ŭ������ �ڽ��� ���ó�� ����� �� �ִ� ���";
	}

	@Override
	public String definePolymorphism() {
		return "<<�������� ����>>\n"
				+ "��ü���� ���α׷����� 3�� Ư¡ �� �ϳ��� ������ ���� ���¸� ���´١��� �ǹ�\r\n" + 
				"�ϳ��� �ൿ���� ���� ���� ���� �����ϴ� ����\r\n" + 
				"����� �̿��� ����� �θ� Ŭ���� Ÿ�� �������� �ϳ���\r\n" + 
				"��� ���迡 �ִ� ���� Ÿ���� �ڽ� ��ü�� ������ �� �ִ� ���";
	}

	@Override
	public String defineAbstractClass() {
		return "<<�߻� Ŭ������ ����>>\n"
				+ "��ü���� �޼ҵ带 ������ Ŭ����";
	}

	@Override
	public String defineInterface() {
		return "<<�������̽��� ����>>\n"
				+ "����� �ʵ�� �߻� �޼ҵ常�� �ۼ��� �� �ִ� �߻� Ŭ������ ����ü\r\n" + 
				"�޼ҵ��� ���ϼ��� �ο��ϱ� ���� �߻� �޼ҵ常 ���� ��Ƴ��� ������\r\n" + 
				"��� �� �������̽� ���� ���ǵ� ��� �߻�޼ҵ� �����ؾ� ��";
	}

	@Override
	public String gugudan(int start, int end) {
		
			start = sc.nextInt();
			end = sc.nextInt();
			
			
		
		
		
		
		
		return "" ;
	}

	@Override
	public String reverseStar(int input) {
		return null;
	}

}
