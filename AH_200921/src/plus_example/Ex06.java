package plus_example;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int area1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ ǥ�õ� ���� :");
		area1 = scanner.nextInt();
		
		int area2 = area1*area1;
		System.out.print("�������ͷ� ǥ�õ� ���� : " + area2);
		
	}

}
