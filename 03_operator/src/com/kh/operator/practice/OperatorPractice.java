package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int A = sc.nextInt();
		sc.nextLine();
		
		String result = (A > 0) ? "�����" : "����� �ƴϴ�";
		
		System.out.println(result);
			
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int B = sc.nextInt();
		sc.nextLine();
		
		String result = (B > 0) ? "�����" : ( (B == 0) ? "0�̴�." : "������");
	
		System.out.println("\n" + result);
	}

	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int C = sc.nextInt();
		sc.nextLine();
		
		String result = (C % 2 == 0) ? "¦����" : "Ȧ����";
		
		System.out.println();
		System.out.println(result);
		
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
			int person = sc.nextInt();
			sc.nextLine();
			
		System.out.print("���� ���� : ");
			int candy = sc.nextInt();
			sc.nextLine();
			
		int result1 = candy / person;
		int result2 = candy % person;
		
		System.out.println();
		System.out.println("1�δ� ���� ���� : " + result1);
		System.out.println("���� ���� ���� : " + result2);
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
			String name = sc.nextLine();
			
		System.out.print("�г� (���ڸ�) : ");
			int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
			int clas = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
			int number = sc.nextInt();
			sc.nextLine();			
		
		System.out.print("����(M/F) : ");
			char gender = sc.nextLine().charAt(0);
			String result = (gender == 'M') ? "���л�" : "���л�";
		
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
		 	double score = sc.nextDouble();
		 	
		System.out.print(grade + " �г� " + clas + " �� " + name + " " + result +" �� ������ " + score + "�̴�.");
		
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = (age >= 20) ? "����" : (age <= 20 && age >=14 ) ? "û�ҳ�" : "���";
			
		System.out.println(result);
		
		
	}
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
			int kor = sc.nextInt();
			sc.nextLine();
		
		System.out.print("���� : ");
			int eng = sc.nextInt();
			sc.nextLine();
		
		System.out.print("���� : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			
		 int result1 = kor + eng + math;
		 double score = result1 / 3.0;
		 String result2 = (kor >= 40) && (eng >= 40) && (math >= 40) 
				 			&& (score >= 60) ? "�հ�" : "���հ�";
		
			
			
		System.out.println("�հ� : " + result1);
		System.out.println("��� : " + score );
		System.out.println(result2);
		
		
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� (-����) : ");
		char name = sc.nextLine().charAt(7);
		 String result = (name == '1' ) ? "����" : (name == '2') ? "����" : "�ٽ� �Է����ּ���";
		
		 System.out.println();
		 System.out.println(result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
			System.out.print("����1 : ");
			 int num1 = sc.nextInt();
			 sc.nextLine();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�Է� : ");
			int a = sc.nextInt();
			sc.nextLine();
			
			String result = ((a <= num1 || a > num2 ) ? "true" : "false");
			
			System.out.println();
			System.out.println(result);
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			
		System.out.print("�Է�2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
		System.out.print("�Է�3 : ");
			int num3 = sc.nextInt();
			sc.nextLine();
			
			String result = (num1 == num2) && (num2 == num3) ? "true" : "false";
	
			System.out.println(result);
	
	}
		
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A����� ���� : ");
			int A = sc.nextInt();
			sc.nextLine();
		
			double Aa = A*1.4;
			
			
			
		System.out.print("B����� ���� : ");
			int B = sc.nextInt();
			sc.nextLine();
			
			double Bb = B;
			
		System.out.print("C����� ���� : ");
			int C = sc.nextInt();
			sc.nextLine();
			
			double Cc = C*1.15;
		
		String a1 = "3000 �̻�";
		String a2 = "3000 �̸�";
			
			
		System.out.println();
		System.out.println("A��� ����/����+a : 2500/" + Aa);
		System.out.println(Aa >=3000 ? a1 : a2);
		
		
		System.out.println("A��� ����/����+a : 2900/" + Bb);
		System.out.println(Bb >=3000 ? a1 : a2);
		
		System.out.println("A��� ����/����+a : 2600/" + Cc);
		System.out.println(Cc >=3000 ? a1 : a2);
		
		
	}
	
	
	
	
	
}















