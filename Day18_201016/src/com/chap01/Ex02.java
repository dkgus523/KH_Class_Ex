package com.chap01;

public class Ex02 {

	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "�ѳ�";
		str[1] = "�γ�";
		str[2] = "����";
		
		//for��
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		//for-each��
		for(String s : str) {
			System.out.println(s);
		}

	}

}
