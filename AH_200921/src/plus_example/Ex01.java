package plus_example;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1=0, num2=0;
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		num1 = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		num2 = scanner.nextInt();
		System.out.println("합 = " + (num1+num2));
		System.out.println("차 = " + (num1-num2));
		System.out.println("곱 = " + (num1*num2));
		
	}

}
