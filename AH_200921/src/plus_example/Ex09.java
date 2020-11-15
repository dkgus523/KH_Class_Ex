package plus_example;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int fiveHundred, oneHundred, fifty, ten;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전들의 개수 : ");
		fiveHundred = scanner.nextInt();
		
		System.out.print("100원짜리 동전들의 개수 : ");
		oneHundred = scanner.nextInt();
		
		System.out.print("50원짜리 동전들의 개수 : ");
		fifty = scanner.nextInt();
		
		System.out.print("10원짜리 동전들의 개수 : ");
		ten = scanner.nextInt();
		
		int total = fiveHundred*500 + oneHundred*100 + fifty*50 + ten*10;
		System.out.println("총액 : " + total);
	}

}
