package plus_example;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int length, width;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ ���� : ");
		length = scanner.nextInt();
		
		System.out.print("������ ���� : ");
		width = scanner.nextInt();
		
		int area = length*width;
		System.out.println("���� : " + area);
	}

}
