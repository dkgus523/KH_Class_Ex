package com.chap03;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	public void main() {
		SportsCar s = new SportsCar();
		s.stop();
		System.out.println();
	}
	

}
