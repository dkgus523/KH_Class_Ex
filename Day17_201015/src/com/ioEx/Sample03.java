package com.ioEx;

public class Sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] test;
			test = new int[5];
			
			System.out.println("test [10]에 값을 대입합니다.");
			
			test[10] = 80;
			System.out.println("test[10]에 80을 대입했습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이를 넘어셨습니다.");
		} finally {
			System.out.println("마지막에 반드시 이 코드가 실행합니다.");
		}
		System.out.println("무사히 종료했습니다.");
	}

}
