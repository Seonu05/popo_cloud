package com.kh.poly.chap01.ex.view;

import java.util.Scanner;

import com.kh.poly.chap01.ex.model.service.ElectronicsService;
import com.kh.poly.chap01.ex.model.vo.Desktop;
import com.kh.poly.chap01.ex.model.vo.Laptop;
import com.kh.poly.chap01.ex.model.vo.Tablet;

public class ElectronicsView {
	
	private ElectronicsService service = new ElectronicsService();
	private Scanner sc = new Scanner(System.in);
	
	
	public ElectronicsView() {
		service.insert(new Desktop(true, "�Ｚ", "s001", "2080ti"));
		service.insert(new Laptop(true, "LG", "1100", 80));
		service.insert(new Tablet(true, "����", "a200", "������ ��ġ ��ũ��"));
	}
	
	
	public void mainMenu() {
		
		int input = 0;
		do {
			System.out.println("===== �޴� ���� =====");
			System.out.println("1. ��� ���� ��ȸ");
			System.out.println("2. ��ü ���� ��ȸ");
			System.out.println("3. �Ǹ� ���� ���� ��ȸ");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : selectOneMenu(); break ;
			case 2 : System.out.println(service.selectAll());break ;
			case 3 : selectSoldOutMenu(); break; 
			case 9 : System.out.println("[���α׷� ����]"); break;
			default : System.out.println("�ٽ� �Է����ּ���.");
			
			}
			
		}while(input !=9);
		
	}
	
	//��� ���� ��ȸ �޴�
	public void selectOneMenu() {
		
		int input = 0;
		do {
			System.out.println("===== ��� ���� ��ȸ �޴� =====");
			System.out.println("1. ����ũž");
			System.out.println("2. ��Ʈ��");
			System.out.println("3. �º�");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : case 2 :case 3 : 
				System.out.println(service.selectone(input));	
				break; 
			case 9 : System.out.println("<<�������� �̵�>>"); break;
			default : System.out.println("�ٽ� �Է����ּ���.");
			
			}
			
		}while(input !=9);		
	}
	
	public void selectSoldOutMenu() {
		
		//�Ǹ� ���� ���� ��ȸ �޴�
		int input = 0;
		do {
			System.out.println("===== �Ǹ� ���� ���� ��ȸ �޴� =====");
			System.out.println("1. ����ũž");
			System.out.println("2. ��Ʈ��");
			System.out.println("3. �º�");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : case 2 : case 3 : 
				System.out.println(  service.selectSoldOut(service.selectone(input))  );
				
				break; 
			case 9 : System.out.println("<<�������� �̵�>>"); break;
			default : System.out.println("�ٽ� �Է����ּ���.");
			
			}
			
		}while(input !=9);
		
	}
}
