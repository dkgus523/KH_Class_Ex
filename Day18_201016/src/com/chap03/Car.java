package com.chap03;

public class Car {
	//ÇÊµå
	public int speed;
	
	//¸Ş¼Òµå
	public void speedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("Â÷¸¦ ¸ØÃã");
		speed = 0;
	}
}