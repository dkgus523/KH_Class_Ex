package chap03;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		System.out.print("문자를 입력하세요 : ");
		String str = scan.next();
		
		System.out.println(a);
		System.out.println(str);
	}
}

