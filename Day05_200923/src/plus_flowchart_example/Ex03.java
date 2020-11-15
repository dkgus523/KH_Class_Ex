package plus_flowchart_example;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a>b) {
			System.out.println("최대값은 " + a + "입니다.");
			System.out.println("최소값은 " + b + "입니다");
		} else {
			System.out.println("최대값은 " + b + "입니다.");
			System.out.println("최소값은 " + a + "입니다");
		}
	}

}
