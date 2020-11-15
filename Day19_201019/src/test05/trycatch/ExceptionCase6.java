package test05.trycatch;

import java.util.Scanner;

public class ExceptionCase6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.print("a/b... a?");
			int n1 = s.nextInt();
			System.out.printf("%d \n",n1);
		} catch(Exception e) {
			System.out.println("문제가 발생하였습니다.");
		}
		System.out.println("Good bye~~!");
	}

}
