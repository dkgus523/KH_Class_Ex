package com.threadEx;

public class Sample02 {

	public static void main(String[] args) {
		Car car1 = new Car("1ȣ��");
		car1.start();
		
		Car car2 = new Car("2ȣ��");
		car2.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("main() �޼ҵ� �������Դϴ�.");
		}

	}

}
