package com.kh.poly.chap01.ex.model.service;

import com.kh.poly.chap01.ex.model.vo.Desktop;
import com.kh.poly.chap01.ex.model.vo.Electronics;
import com.kh.poly.chap01.ex.model.vo.Tablet;

public class ElectronicsService {
	
	// �θ� Ÿ�� ��ü�迭�� ���� �� �Ҵ��Ͽ� 
	// �ڽ� ��ü���� �� ���� ����
	private Electronics[] el = new Electronics[3];
	
	private int index =0;
	
	//�ܺп��� ������ ��ü�� �ּҸ� ���޹޾� el �迭�� �߰�
	/*public void insert(Desktop desk) {}	
	public void insert(Laptop lap) {}
	public void insert(Tablet tap) {}*/
	//�����ε��� ����ص� ������ �ڵ���̰� �þ�� ��ȿ����
	//--> �������� �����Ͽ� �Ű������� Ÿ���� �θ�Ÿ������ �Ͽ�
	//�ڽ� ��ü �ּҸ� ���� �޵��� ��.
	
	public void insert(Electronics e) {//�Ű������� ������ ����
		el[index ++] = e; //��ü �迭�� ������ ����
		//index��° el��ҿ� ���޹��� �ڽ� ��ü �ּҸ� �߰��ϰ�
		//index�� 1 ������Ŵ
	}
	
	//��ü ���� ��ȸ
	public String selectAll() {
		String str ="\n@@@@@ ��ü ��ǰ ��ȸ @@@@@\n";
		
		for(int i=0; i<el.length; i++) {
			str += el[i].toString() + "\n";
			//el[i].toString()
			//�θ��� toString()�� ȣ���ϰ� ������(���� ���ε�)
			//���� ����� �ڽ��� �������̵��� toString�� ȣ����.
			//(�������ε�)
		}
		
		
		return str;
	}
	
	//�� ������� ��ȸ
	/*public Desktop selectDesktop(int i) {}
	public Laptop selectLaptop(int i) {}*/
	//���� ��� �ϳ����� ������ ��ȯ�ؾߵǴ� ���
	//��⺰�� Ÿ���� ��� �ٸ��Ƿ� ��ȯ���� �ٸ��� �ؼ� �޼ҵ带 �ۼ��ؾ���.
	//������, �����ε��� �������� ����(�Ű������� ��� ����)
	//�׷��� �޼ҵ带 ���ε��� ������������ ���ŷӰ� ȿ�������� ����
	// --> ��ȯ���� �������� ����
	public Electronics selectone(int i) {
		return el[i-1];
	}
	
	//��� �Ǹ� ���� ����(ǰ��)
	public String selectSoldOut(Electronics e) {
		if(e instanceof Tablet) {
			//e�� �����ϰ� �ִ� ��ü�� Tablet Ÿ���̸�
			return "�Ǹ� �Ұ�[ǰ��]";
		}else {
			return "�Ǹ� ����";
		}
	}
	


}