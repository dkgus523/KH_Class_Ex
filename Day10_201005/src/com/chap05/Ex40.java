package com.chap05;

class Car
{
	int num = 10;
	double gas = 12.34;
	public Car()
	{
		System.out.println(num +", " + gas);
		System.out.println("�ڵ����� ����������ϴ�.");
	}
}

class RacingCar extends Car
{
	public RacingCar()
	{
		System.out.println(num +", " + gas);
		System.out.println("���̽� ī�� ����������ϴ�.");
	}
}

public class Ex40 {

	public static void main(String[] args) {
		new Car();
		new RacingCar();
	}

}

