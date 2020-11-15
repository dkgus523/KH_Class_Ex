package com.chap01;

public class Ex02 {

	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "한나";
		str[1] = "두나";
		str[2] = "세나";
		
		//for문
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		//for-each문
		for(String s : str) {
			System.out.println(s);
		}

	}

}
