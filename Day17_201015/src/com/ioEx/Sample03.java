package com.ioEx;

public class Sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] test;
			test = new int[5];
			
			System.out.println("test [10]�� ���� �����մϴ�.");
			
			test[10] = 80;
			System.out.println("test[10]�� 80�� �����߽��ϴ�.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���̸� �Ѿ�̽��ϴ�.");
		} finally {
			System.out.println("�������� �ݵ�� �� �ڵ尡 �����մϴ�.");
		}
		System.out.println("������ �����߽��ϴ�.");
	}

}
