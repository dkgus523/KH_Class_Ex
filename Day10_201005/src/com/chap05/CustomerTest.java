package com.chap05;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "�ѳ��̵��");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

	}

}
