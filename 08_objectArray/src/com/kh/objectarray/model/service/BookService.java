package com.kh.objectarray.model.service;

import java.util.Scanner;

import com.kh.objectarray.model.vo.Book;

public class BookService {
	//Book ��ü 5���� �Ű����� �ִ� �����ڸ� �̿��Ͽ� ���� �� 
	//å ������ �Է¹޾�
	//�ش� å�� �ִ��� �˻��Ͽ� 
	//������ Book ��ü�� �ʵ����� ���
	//������ "�ش��ϴ� å�� �����ϴ�." ���
	
	//�ʵ忡 Scanner ��ü�� �����Ͽ� Ŭ���� ���ο��� ��� ��� �����ϰ���.
	private Scanner sc = new Scanner(System.in);
	public void searchBookV1() {
		
		//å 5�� ��ü ����
		Book bk1 = new Book("�ڹ��� ����", 30000, 0.2, "���� ��");
		Book bk2 = new Book("C����� ����", 50000, 0.1, "��ö��");
		Book bk3 = new Book("�� �ڹ� ��մ�", 100000, 0.05, "�鵿��");
		Book bk4 = new Book("�����", 10000, 0.1, "�����㺣��");
		Book bk5 = new Book("�ظ�����", 12000, 0.3, "����k�Ѹ�");
		
		
		//�˻��� å ���� �Է¹ޱ�;
		System.out.print("�˻��� å ������ �Է��ϼ��� : ");
		String title = sc.nextLine();
		
		if(bk1.getTitle().equals(title)) {
			//bk1�� ����� �Է¹��� ������ ���� ���
			System.out.println(bk1.selectBook());
			
		}else if(bk2.getTitle().equals(title)) {
			System.out.println(bk2.selectBook());
			
		}else if(bk3.getTitle().equals(title)) {
			System.out.println(bk3.selectBook());
			
		}else if(bk4.getTitle().equals(title)) {
			System.out.println(bk4.selectBook());
			
		}else if(bk5.getTitle().equals(title)) {
			System.out.println(bk5.selectBook());
			
		}else {System.out.println("�ش��ϴ� å�� �����ϴ�.");}
		
		
	}
	
	
	//��ü �迭�� �̿��Ͽ� å �˻��ϱ�
	public void searchBookV2() {
		
//		Book[] books = new Book[5];
		
//		Book bk1 = new Book("�ڹ��� ����", 30000, 0.2, "���� ��");
//		Book bk2 = new Book("C����� ����", 50000, 0.1, "��ö��");
//		Book bk3 = new Book("�� �ڹ� ��մ�", 100000, 0.05, "�鵿��");
//		Book bk4 = new Book("�����", 10000, 0.1, "�����㺣��");
//		Book bk5 = new Book("�ظ�����", 12000, 0.3, "����k�Ѹ�");
		
//		books[0] = new Book("�ڹ��� ����", 30000, 0.2, "���� ��");
//		books[1] = new Book("C����� ����", 50000, 0.1, "��ö��");
//		books[2] = new Book("�� �ڹ� ��մ�", 100000, 0.05, "�鵿��");
//		books[3] = new Book("�����", 10000, 0.1, "�����㺣��");
//		books[4] = new Book("�ظ�����", 12000, 0.3, "����k�Ѹ�");
		
		Book[] books = {
				new Book("�ڹ��� ����", 30000, 0.2, "���� ��"),
				new Book("C����� ����", 50000, 0.1, "��ö��"),
				new Book("�� �ڹ� ��մ�", 100000, 0.05, "�鵿��"),
				new Book("�����", 10000, 0.1, "�����㺣��"),
				new Book("�ظ�����", 12000, 0.3, "����k�Ѹ�")
		};
		
		//int[] arr = {1, 2, 3, 4, 5};
		
		//å ���� �Է� �ޱ�
		System.out.print("�˻��� å ������ �Է��ϼ��� : ");
		String title = sc.nextLine();
		
		boolean flag = true;
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(title)) {
				//books�� i��° �ε��� ����� Title�� 
				//�Է¹��� ���� ���ٸ�?
				System.out.println(books[i].selectBook());
				flag = false;//�˻��� �Ȱ�� flag�� false�� �ٲ�
				break;
			}
		}//for�� end
		
		if(flag) {
			System.out.println("�ش��ϴ� å�� �����ϴ�.");
		}
	}
	
	
	
	
}


















