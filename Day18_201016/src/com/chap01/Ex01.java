package com.chap01;

public class Ex01 {

	public static void main(String[] args) {
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		
		//���1
		if(strVar1 == strVar2) {
			System.out.println("���ڰ� �����ϴ�");
		} else {
			System.out.println("���ڰ� �ٸ��ϴ�.");
		}
		
		//���2
		if(strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ��Դϴ�.");
		} else {
			System.out.println("�ٸ� ���ڿ��Դϴ�.");
		}
	}

}
