package com.kh.control.chap01.practice;

import java.util.Scanner;

import com.kh.control.chap01.service.A_If;


public class ControlPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. �Է� \n2. ����\n3. ��ȸ\n4. ����\n7. ����\n");
	
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� :");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("�Է� �޴��Դϴ�."); break;
		case 2 : System.out.println("���� �޴��Դϴ�."); break;
		case 3 : System.out.println("��ȸ �޴��Դϴ�."); break;
		case 4 : System.out.println("���� �޴��Դϴ�."); break;
		case 7 : System.out.println("���α׷��� ����˴ϴ�."); break;
		
		
		}
		
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
			int num1 = sc.nextInt();
			
			if(num1 >= 0) {
				
				if(num1 % 2 == 0) {
					
					System.out.println("¦����.");
				}else {
					
					System.out.println("Ȧ����.");
				}
			}else {
				
				System.out.println("����� �Է����ּ���.");
			}
		
		
		
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("�������� : ");
			int kor = sc.nextInt();
		System.out.print("�������� : ");
			int math = sc.nextInt();
		System.out.print("�������� : ");
			int eng = sc.nextInt();
			
		int score = kor + math + eng;
		double ave = (kor + math + eng)/3 ;
		
		if(ave >=60) {
			 if(kor >= 40 || math >= 40 || eng >= 40) {
				 System.out.println("���� : " + kor);
				 System.out.println("���� : " + math);
				 System.out.println("���� : " + eng);
				 System.out.println("�հ� : " + score);
				 System.out.println("��� : " + ave);
				 System.out.println("�����մϴ�, �հ��Դϴ�!");
				 
			 }else {
				 System.out.println("���հ��Դϴ�.");
				 
			  } 
			}else {
				System.out.println("���հ��Դϴ�.");
			}
		
		
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
			int num1 = sc.nextInt();
			
			switch(num1){
				
			case 1: case 2: case 12:
				System.out.println(num1 + "���� �ܿ��Դϴ�"); break;
				
			case 3: case 4: case 5:
				System.out.println(num1 + "���� ���Դϴ�"); break;
				
			case 6: case 7: case 8:
				System.out.println(num1 + "���� �����Դϴ�"); break;
				
			case 9: case 10: case 11:
				System.out.println(num1 + "���� �����Դϴ�"); break;
				
				default : System.out.println(num1 + "���� �߸� �Էµ� ���Դϴ�.");
				
				
			}
		
		
	}
	
	
	public void practice5() {
		//���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
		//�α��� ���� �� ���α��� ������,
		//���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
		//��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		String id = "myId";
		String password = "myPassword12";
		
		
		System.out.print("���̵� : ");
			String inputId = sc.nextLine();
			
		System.out.print("��й�ȣ : ");
			String inputPassword = sc.nextLine();
			
			// *Ŭ������ �ڷ��� -> �׷��� String�� �ڷ���
			// Strinf.equals()
			//String �ڷ����� ������ �ִ� ��¥ ������ �������� ���ϴ� �޼ҵ�
			//����� True �Ǵ� false ��ȯ
			
			if(id.equals(inputId)) {
				
				if(password.equals(inputPassword)) {
					System.out.println("�α��� ����");
					
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					
				}
			
			}else {
				
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
			}
			
	}
	
	public void practice6(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
			String grade = sc.nextLine();
			
			switch (grade) {
			
			case "������" : System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ");
			break;
			case "ȸ��" : System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ� ");
			break;
			case "��ȸ��" : System.out.println("�Խñ� ��ȸ");
			break;
			
			
			}
	}
	
	
	public void practice7(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է����ּ��� : ");
			double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է����ּ��� : ");
			double weight = sc.nextDouble();
			
		double bmi = weight / (height * height);	
		
		System.out.println("bmi ���� : " + bmi);
		
		if(bmi >= 30) {
			System.out.println("�� ��");
		
		}else if(bmi >= 25) {
			System.out.println("��");
			
		}else if(bmi >= 23) {
			System.out.println("��ü��");
			
			
		}else if(bmi >= 18.5) {
			System.out.println("����ü��");
		
		}else {
			System.out.println("��ü��");
			
			
		}
		
			
		
	}
	
	public void practice8() {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("�ǿ�����1 �Է� : ");
	      int a = sc.nextInt();
	      sc.nextLine();
	      System.out.print("�ǿ�����2 �Է� : ");
	      int b = sc.nextInt();
	      sc.nextLine();
	      System.out.print("������ �Է�(+,-,*,/,%) : ");
	      char c = sc.nextLine().charAt(0);
	      double result = 0;
	      if (a > 0 && b > 0) {
	         if (c == '+') {
	            result = (double)a + b;
	            System.out.printf("%d %c % d = %f",a,c,b,result);
	         }else if (c == '-') {
	            result = (double)a - b;
	            System.out.printf("%d %c % d = %f",a,c,b,result);
	         }else if (c == '*') {
	            result = (double)a * b;
	            System.out.printf("%d %c % d = %f",a,c,b,result);
	         }else if (c == '/') {
	            result = (double)a / b;
	            System.out.printf("%d %c % d = %f",a,c,b,result);
	         }else if (c == '%') {
	            result = (double)a % b;
	            System.out.printf("%d %c % d = %f",a,c,b,result);
	         }else { 
	            System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
	         }
	      }else {
	         System.out.println("����� �ƴմϴ�.");
	      }
	   }
	public void practice9(){}
	
	
	
	public void practice10(){
		
		Scanner sc = new Scanner(System.in);
		
		A_If af = new A_If();
		
		System.out.println("������ ����� �����ϼ��� : ");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. Pass/Fail");
		
		System.out.println("10. if�� 1��");
		
		System.out.print("���� : ");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		
		//���� Ŭ���� ���� �޼ҵ� ������ 
		//�޼ҵ���� �ۼ��ϴ� ������ ȣ�� ����
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 10 :af.example1(); break;
		
		
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		
		}
		
		
	}
	
	
	
}





















