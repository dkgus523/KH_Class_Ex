package plus_flowchart_example;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a>b && a>c) {
			System.out.print("최대값은 " + a + "입니다.");
		} else if(b>a && b>c) {
			System.out.print("최대값은 " + b + "입니다.");
		} else {
			System.out.print("최대값은 " + c + "입니다.");
		}
	}

}
