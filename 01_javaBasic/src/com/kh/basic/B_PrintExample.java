package com.kh.basic;

public class B_PrintExample {
	
		public void printValue() {
			//�������� ������ ���� ����ϴ� �޼ҵ�(���)
			
			//���ڿ� ("")			
			System.out.println("���ڿ� ���");	
			System.out.print("���õ� ȭ����~!!");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("���� �ð� �Դϴ�");
			
			//���� ���
			//���ڿ�ó�� ""(�ֵ���ǥ)�� ������� �ʾƵ� �ȴ�.
			System.out.println("----���� ���----");
			System.out.println(123); // ����
			System.out.println(1.23);// �Ǽ�
			
			//���ڴ� ���������� ���굵 �����ϴ�.
			System.out.println(2+3);
			System.out.println(3.14-0.14);
			// �Ǽ� ������ ������� �Ȱ��� �Ǽ�
			
			// �ڹٴ� ���ڿ������� ���ϱⰡ �ɱ�? -> �����ϴ�.
			// abc + def = abcdef
			
			System.out.println("-----���ڿ� ���ϱ�-----");
			System.out.println("��..." + "������پ�...");
			
			//���� + ���ڿ�
			//���ڿ��� �������� ����� ���ڿ��� �ƴ� ���
			//�� ���ڷ� �ٲ����
			System.out.println("----����  + ���ڿ�----");
			System.out.println(5 + 10 + "Hello");
			// 15 + "Hello" --> "15" + "Hello" == "15Hello"
			
			
			//���ڿ� + ����
			System.out.println("----���ڿ� + ����----");
			System.out.println("Hello" + 5 + 10);
			//"Hello" + 5 + 10 --> "Hello" + "5" + 10
			//"Hello5" + 10 --> "Hello5" + "10" == "Hello510"
		}

}
