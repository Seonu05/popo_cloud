package com.kh.api.chap01.model.service;

import java.util.Scanner;

public class StringService {
	//String Ŭ���� 
	// - immutable(�Һ�) ��ü�� �� �� ������ ���ڿ��� ���� �Ұ���
	//	--> ���� �� ���ο� ���ڿ� ��ü�� �����ǰ� �ش� �ּҸ� ��ȯ��
	
	public void example1() {
		
		//1) String �� ���� �� �ּҰ� �ٲ���� Ȯ��
		
		String s1 = "ABC";
		//String �� hashCode()�� ���ڿ��� �̿��Ͽ� ���� ���ϴ� ���̱� ������
		//�ּҰ� ������ Ȯ���ϴµ��� ������
		//--> System.identityHashCode()���
		// 	--> ��ü�� ���� ���� �ּҸ� �̿��Ͽ� hashCode�� ����� �޼ҵ�
		
		System.out.println("���� �� s1 : " + System.identityHashCode(s1));
		
		s1 = "ABCD";

		System.out.println("���� �� s1 :" + System.identityHashCode(s1));
	
	
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println("str1.equals(str) : " + str1.equals(str2));
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		//String Literal(���ͷ�)�� String�� ������ 
		//���� ���ڿ� �� ��� ���� �ּҸ� ��ȯ�Ѵ�.
		//(+String Pool)
		
		String str3 = new String("Hello");
		System.out.println("str3 : " + str3);
		
		System.out.println("str1 == str3 : " + (str1 == str3));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("str �Է� : ");
		String str4 = sc.nextLine();
				
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str4));
		System.out.println("str1 == str4 " + (str1 == str4));
		
		System.out.println("String ����񱳰� �ʿ��ϸ� eqrals() ����� ��!");
		System.out.println("String�� �Һ��̴�.");
		
		}
	
		public void example2() {
			//StringBuffer
			// - ���ڿ� ������ ������ mutable(����)��ü
			
			StringBuffer sb = new StringBuffer();
			//StringBuffer ��ü�� �⺻ �����ڷ� ������
			//�⺻ ����ũ�� 16�� �Ҵ���
			
			//capasity() : �뷮 Ȯ��
			System.out.println("sb.capacity() : " + sb.capacity());
			
			System.out.println("sb.hashCode() : "+ sb.hashCode());
			//StringBuffer Ŭ������ hashCode()�� �������̵� ��������
			//object.hashCode(): ��ü �ּҸ� �̿��Ͽ� �ؽ��ڵ� ����
			
			//append() : ���� ���ڿ� �ڿ� �߰�
			sb.append("java api");
			System.out.println("�߰� �� Sb.capasity() : " + sb.capacity());
			System.out.println("�߰� �� Sb.hashCode() : " + sb.hashCode());
		
			sb.append("1234567890"); //���� �뷮�� 16ĭ �߰� (���� 18)
			System.out.println("�߰�2 �� Sb.capasity() : " + sb.capacity());
			System.out.println("�߰�2 �� Sb.hashCode() : " + sb.hashCode());
		
			System.out.println("sb : "+ sb);
			
			//StringBuffer�� String���� ��ȯ�ϴ� ���
			String str = sb.toString();
		}
		
		public void example3() {
			//String .split(������);
			// --> ���ڿ��� �ش� �����ڸ� �������� �ɰ��� String[] ���·� ��ȯ
			
			String str = "���, ����, ����, ������, ����, ���, ������, �ڵ�";
			
			//,(����)�� �����ڷ� �Ͽ� ����
			String[] arr = str.split(",");
		
			for (int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		
		}

		
		
		
		
		
		
		
		
		
		
		
}

















