package plus_flowchart_example;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a>b) {
			System.out.println("�ִ밪�� " + a + "�Դϴ�.");
			System.out.println("�ּҰ��� " + b + "�Դϴ�");
		} else {
			System.out.println("�ִ밪�� " + b + "�Դϴ�.");
			System.out.println("�ּҰ��� " + a + "�Դϴ�");
		}
	}

}
