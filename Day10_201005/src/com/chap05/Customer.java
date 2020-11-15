package com.chap05;

public class Customer {
	public int customerID;
	public String customerName;
	public String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer() {
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + ", ����Ʈ�� " + bonusPoint ;
	}

}

