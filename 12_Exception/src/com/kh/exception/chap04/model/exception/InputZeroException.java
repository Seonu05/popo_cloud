package com.kh.exception.chap04.model.exception;

public class InputZeroException extends Exception {
	//����� ���� ���� ���� ���
	// --> Exception �Ǵ� �� �ļ� Ŭ������ ��ӹ����� ��.
	
	//���� checked Exception���� ���� ���
	//���� Exception ��ӹ���
	
	//���� UnChecked Exception���� ���� ���
	//RuntimeException�� ��ӹ���
	
	public InputZeroException() {
		super();
	}
	
	public InputZeroException(String msg) {
		super(msg);
	}
	

}
