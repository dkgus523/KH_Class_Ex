package plus_example;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int fiveHundred, oneHundred, fifty, ten;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500��¥�� �������� ���� : ");
		fiveHundred = scanner.nextInt();
		
		System.out.print("100��¥�� �������� ���� : ");
		oneHundred = scanner.nextInt();
		
		System.out.print("50��¥�� �������� ���� : ");
		fifty = scanner.nextInt();
		
		System.out.print("10��¥�� �������� ���� : ");
		ten = scanner.nextInt();
		
		int total = fiveHundred*500 + oneHundred*100 + fifty*50 + ten*10;
		System.out.println("�Ѿ� : " + total);
	}

}
