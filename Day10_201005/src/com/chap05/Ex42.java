package com.chap05;


public class Ex42 {

	public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        
        Car car3;
        car3 = car1;
        
        boolean bl1 = car1.equals(car2);
        boolean bl2 = car1.equals(car3);
        
        System.out.println ("car1�� car2�� ������ ������ ���, " + bl1 );
        System.out.println ("car1�� car3�� ������ ������ ���, " + bl2 );

	}
}


