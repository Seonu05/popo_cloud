package com.kh.exception.chap01.model.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionService {
	//Unchecked Excepion
	//������ ���� ó���� ���� �ʾƵ� �Ǵ� ����(Exception)
	//�ַ� ���α׷����� �����Ƿ� ���� ������ ��찡 ���� ������
	//���� ó�� �ڵ� ���� if�� ���� �̿��Ͽ� �ڵ带 �����ϴ� ��찡 ����

	//�� ���ڸ� �Է¹޾� ������ �ϴ� ���α׷�
	public void example1() {
		Scanner sc = new Scanner(System.in);	
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		
		if(num2 ==0) {
			System.out.println("0���� ���� �� �����ϴ�.");		
		}else {
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));	
		}
		
		// 5 ������ 0���� java.lang.ArithmeticException : / by zero
		// ��� ���� �� 0���� ������ ���� ��Ȳ�� �߻�
		// �� ������ if������ �ذ� ����
		// �̷� �����߻��� ���α׷����� �����Ǵ�. �����ϸ� �ۼ��ؾ���.
		
	}
	
	
	public void  example2() {
	      
	      String[] arr = {"��������", "����", null, "������" };
	      
	      for(int i = 0; i<arr.length; i++) {
	    	  if(arr[i] != null) {//nullPointException ����
	         System.out.println(arr[i].length());
	    	  }
	      }
	      
	      //java.lang,NullPointerException
	      //null : �ƹ��͵� �����ϰ� ���� �ʴ�.
	      //����� ���� null�� ���������� �̿��Ͽ� ��ü ��� ���� �õ��� �߻��ϴ� ����
	      
	      //java.lang.ArrayIndexOutOfBoundsExcepption:4
	      //�迭�� �ε��� ������ �Ѿ�� �����Ҷ� �߻��ϴ� ����
	   }
	
	public void example3() {
		//Checked Exception
		//�ݵ�� ���� ó���� �ؾ��ϴ� ����(Exception)
		//�ַ� IO(�����) ��Ȳ���� ���� �߻���.
		
		BufferedReader br
			= new BufferedReader(new InputStreamReader(System.in));
		//Scanner (jdk 1.5)������ ���Ǵ� Ű���� �Է� ���
		
		//System.out.print("�Է�");
		//String str = br.readLine();
		//unhandled exception type IOException
		// == IOException ���� ó���� �ȵǾ��ִ�.
		
		
		
		
	}
	
	
	
}





















