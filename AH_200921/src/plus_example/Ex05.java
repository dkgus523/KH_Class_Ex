package plus_example;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int upperside, lowerside, height;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ ���� : ");
		upperside = scanner.nextInt();
		
		System.out.print("�Ʒ����� ���� : ");
		lowerside = scanner.nextInt();
		
		System.out.print("���� : ");
		height = scanner.nextInt();
		
		int area = (upperside + lowerside)*height/2;
		System.out.println("���� : " + area);
	}

}
