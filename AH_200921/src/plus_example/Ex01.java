package plus_example;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1=0, num2=0;
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		num1 = scanner.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		num2 = scanner.nextInt();
		System.out.println("�� = " + (num1+num2));
		System.out.println("�� = " + (num1-num2));
		System.out.println("�� = " + (num1*num2));
		
	}

}
