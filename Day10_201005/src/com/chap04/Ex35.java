package com.chap04;
class Start{
	public Start() {
		System.out.println("�⺻ ������");
	}
	public Start(int a ) {
		this();
		System.out.println("�Ű����� 1�� �Է� ������");
		
	}
	public Start(int a, int b ) {
		this();
		System.out.println("�Ű����� 2�� �Է� ������");
	}
}
public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start s1 = new Start(1);
		Start s2 = new Start(2,3);
	}

}


