package plus_flowchart_example;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a>b && a>c) {
			System.out.print("�ִ밪�� " + a + "�Դϴ�.");
		} else if(b>a && b>c) {
			System.out.print("�ִ밪�� " + b + "�Դϴ�.");
		} else {
			System.out.print("�ִ밪�� " + c + "�Դϴ�.");
		}
	}

}
