package plus_example;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int area1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("평으로 표시된 면적 :");
		area1 = scanner.nextInt();
		
		int area2 = area1*area1;
		System.out.print("제곱미터로 표시된 면적 : " + area2);
		
	}

}
