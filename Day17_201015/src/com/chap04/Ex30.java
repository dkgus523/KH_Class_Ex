package com.chap04;  //��Ű�� : �ҹ��ڷ� �����ؾ��Ѵ�.

class Data{ //Ŭ���� : �빮�ڷ� �����ؾ��Ѵ�.
	public String name; //����ʵ忡�� ���� �����ڰ� �ٴ´�.
	public int age;
	
	//�������������� ���� �����ڰ� ���� �ʴ´�.
	public Data() {  //���⼭�� �������� ���� �����ϰ�	
		name="�ʱⰪ"; 
		age = -1;	
		System.out.println("������ �����Ϸ�");
	}
	public Data(String name) {
		this.name = name;
		this.age = -1;				
	}
	public Data(int age) {	
		this.name = "�ʱⰪ";	
		this.age = age;
	}
	//���⼭�� �������� ���� ����
	public void print() { //�޼ҵ� : �ҹ��ڷ� �����ؾ��Ѵ�. 
		System.out.println(name);
		System.out.println(age);
	}
}
public class Ex30 {

	public static void main(String[] args) {
		Data d1 = new Data();
		
		d1.print();
		// �����޼ҵ�(static)�� �ƴ� ��� �̷��� ������ ���� �����ؼ� ���
		// print(); -> �����޼ҵ�(static)�� ��� �̷��� ���
		Data d2 = new Data("hanna");
		d2.print();
		Data d3 = new Data(33);
		d3.print();

	}

}
