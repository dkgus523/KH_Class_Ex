package com.chap04;

class Data {
	String name;
	int age;

	public Data() {
		name = "�ʱⰪ";
		age = -1;
		System.out.println("������ �����Ϸ�");
	}

	void print() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Ex30 {
	public static void main(String[] args) {
		Data d = new Data();
		d.print();
	}
}

