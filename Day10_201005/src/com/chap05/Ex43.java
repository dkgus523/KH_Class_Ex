package com.chap05;

//Ż�� Ŭ����
abstract class Vehicle
{
	protected int speed;
	abstract void show();
}

//�ڵ��� Ŭ����
class MiniCar extends Vehicle
{
	public void show()
	{
		speed =10;
		System.out.println("�ӵ��� " +  speed + " �Դϴ�.");
	}
}
//����� Ŭ����
class Plane extends Vehicle
{
	public void show()
	{
		speed =20;
		System.out.println("�ӵ��� " +  speed + " �Դϴ�.");
	}
}
public class Ex43 {

	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];

		vc[0] = new MiniCar();
		vc[1] = new Plane();

		for(int i=0; i<vc.length; i++){
			vc[i].show();
		}
	}
}
