package com.kh.object.chap02_Encapsulation.model.vo;

//vo(Value Object) :��(������)�� ������ �� �ִ� ��ü�� ����� ���� Ŭ����

public class Player { //� ������ �߻�ȭ�� Ŭ����

	//----- �Ӽ� -----
	// * ĸ��ȭ ��Ģ : Ŭ������ ��� ����(�ʵ�)�� private�� �ٿ�
	//				�ܺηκ��� ���� ������ �����ϴ� ��
	
	
	//public String name;//���� (ĸ��ȭ ������)
	public String name;//�̸�
	private String event;//����
	private String uniform; //������
	private boolean kookdae; //������ǥ ����

	
	//----- ��� -----
	//Ŭ���� ���ο� ���� �� �ִ� ����� ����
	//1) ��� ����(�ʵ�)�� �̿��� ���� ó���� �ϴ� ���
	//2) �Ӽ�(�������, �ʵ�)�� �ܺؼ� ���� ������ �� �ִ� ���
	//		--> getter /setter �޼ҵ�
	
	//name�� ���� get/setter �ۼ�
	
	//getter : ��ü�� ���� �ܺη� ��ȯ�ϴ� ����� ������ �޼ҵ�
	//�ܺο��� ������ �� �ֵ��� public���� �����ؾ���.
	public String getName() {
		// -->String (��ȯ��) : �޼ҵ� ���� �� ��ȯ�Ǵ� ���� �ڷ��� 
		
		//return : �޼ҵ� ���� �� ȣ���� ������ 
		//			���������� ���� �ۼ�.
		return name;
		//�ܺο��� getName() ȣ�� �� ��ü�� ���� �Ǿ��ִ�  name ��ȯ
	}
	
	//setter : ��ü�� ���� ����ϴ� ����� ������ �޼ҵ�
	//�ܺο��� ������ �� �ֵ��� public���� ����
	public void setName(String name) {
						// �Ű�����(�Ķ����)
						// �޼ҵ� ȣ�� �� ���޵Ǵ� ���� �޾ƿ�
						// �ش� ��� ���� �� �ʿ��� ��
		this.name = name;
		//this : ���� ��ü�� ���� �ּҸ� ����Ŵ
		//	(���� ��ü�� ����Ŵ)
	}
	
	//event get/setter �ۼ�
	
	//getter
	//public ��ȯ�� get ������(){ //������ ������ �빮��
	//	return ������(�ʵ��);
	//}
	public String getEvent() {
		return event;
	}
	
	//setter
	
	//public void set������(�Ű�����){//������ ������ �빮��
					//�Ű������� set�Ϸ��� �ʵ�� ���� �ڷ��� ������ �ۼ�
	//		this.�ʵ�� = �Ű�������;
	//	}
	public void setEvent(String event) {
		this.event = event;
	}
	
	//uniform get/setter
	public String getUniform() {
		return uniform;
	}
	
	public void setUniform(String uniform) {
		this.uniform = uniform;		
	}
	
	//kookdae get//setter
	public Boolean getKookdae() {
		return kookdae;
	}
	
	public void setKookdae(boolean kookdae) {
		this.kookdae = kookdae;
	}
	
	
}














