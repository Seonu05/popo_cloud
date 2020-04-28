package com.kh.poly.chap01.practice.view;

import java.util.Scanner;

import com.kh.poly.chap01.practice.model.service.LibraryService;
import com.kh.poly.chap01.practice.vo.Book;
import com.kh.poly.chap01.practice.vo.Member;

public class LibraryMenu {
	
	private LibraryService service = new LibraryService();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		//�̸�, ����, ������ Ű����� �Է� ���� �� Member ��ü ����
		System.out.print("�̸� : ");
		String name = sc.next(); //�ԷµǴ� ���� �� �ܾ�(���� ���� �������� �о�帲)
	
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		//sc.next()�� ���ۿ� �����ִ� ���� ���ڸ� �����ϰ� �����ܾ �о����
		
		
		Member m = new Member(name,age,gender);
		
		service.insertMember(m);
		
		
		int menu = 0;
		while(true) {
			System.out.println("==== �޴� ====\n" 
								+ "1. ����������\n"
								+ "2. ���� ��ü ��ȸ\n"
								+ "3. ���� �˻�\n"
								+ "4. ���� �뿩�ϱ�\n"
								+ "9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			
			 menu = sc.nextInt();
			 sc.nextLine();
			 
			 
			 switch(menu) {
			 case 1 : System.out.println(service.myInfo()); break;
			 case 2 : selectAll(); break;
			 case 3 : searchBook(); break;
			 case 4 : rentBook(); break;
			 case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			 	//return : ȣ���� �޼ҵ�� ��ȯ(���ư���)
			 	//void �޼ҵ�� "��ȯ��"�� ����!
			 	//JVM�� ������ �� void �޼ҵ� ���� �������� return�� �ڵ� �߰�
			 default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
			 }
		}
	}
	
	public void selectAll() {
		//libraryService�� selectAll()�� �޼ҵ带  ȣ���Ͽ� ��� �� Book[]�ڷ��� bList�� ���
		Book[] bList = service.selectAll();
		
		for(int i=0; i < bList.length; i++) {
			System.out.println(i + "�� ���� " + bList[i]);
		}
	}
	
	public void searchBook() {
		//�˻��� ���� Ű���� : //�Է¹���(keyword)
		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		
		// �Էµ� Ű���带 �̿��Ͽ� LibraryService�� searchBook()�� ȣ���ϰ�
		// ��ȯ���� book[] �ڷ��� searchList�� ���� ��
		Book[] searchList = service.searchBook(keyword);
		
		
		// for���� �̿��Ͽ� �˻� ����� ���� ��� ���
		for(int i=0; i < searchList.length; i++) {
			if(searchList[i] == null) {
				
				break;
			}
				System.out.println(searchList[i]);
		}
	}
	
	public void rentBook() {
		selectAll();
		
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		
		int result = service.rentBook(index);
		
		if(result == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		}else if(result ==1) {
			System.out.println("���� �������� �뿩 �Ұ��� �Դϴ�.");
		}else {
			System.out.println("���������� �뿩�Ǿ����ϴ�.\n�丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���");
			
		}
		
		
		
		
	}

}
