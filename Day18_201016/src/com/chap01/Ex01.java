package com.chap01;

public class Ex01 {

	public static void main(String[] args) {
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		//방법1
		if(strVar1 == strVar2) {
			System.out.println("문자가 같습니다");
		} else {
			System.out.println("문자가 다릅니다.");
		}
		
		//방법2
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열입니다.");
		} else {
			System.out.println("다른 문자열입니다.");
		}
	}

}
