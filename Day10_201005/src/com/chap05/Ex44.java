package com.chap05;
//Ż�� �������̽�
interface iVehicle
{
	void vShow ();
}
//���� �������̽�
interface iMaterial
{
	void mShow();
}
//�ڵ��� Ŭ����
class Car1 implements iVehicle, iMaterial
{
	public Car1()
	{
		System.out.println("Car1 ������");
	}
	public void vShow()
	{
		System.out.println("vShow()");
	}
	public void mShow()
	{
		System.out.println("mShow()");
	}
}


public class Ex44 {
	public static void main(String[] args)
	{
		Car1 car1 = new Car1();
		car1.vShow();
		car1.mShow();
	}
}
