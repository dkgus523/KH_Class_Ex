package com.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample04 {

	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			System.out.println(str + "(��)�� �ԷµǾ����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
	}

}
