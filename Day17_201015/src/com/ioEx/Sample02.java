package com.ioEx;

public class Sample02 {

	public static void main(String[] args) {
		try {
			int[] test;
			test = new int[5];
			
			System.out.println("test [10]�� ���� �����մϴ�.");
			
			test[10] = 80;
			System.out.println("test [10]�� 80�� �����߽��ϴ�.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���̸� �Ѿ���ϴ�.");
		}
		System.out.println("������ �����߽��ϴ�.");
		
	}

}
