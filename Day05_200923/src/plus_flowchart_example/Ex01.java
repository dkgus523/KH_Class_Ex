package plus_flowchart_example;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int max   ;
		
		if(a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.printf("%d, %d, %d", a, b, max);
	}
}
