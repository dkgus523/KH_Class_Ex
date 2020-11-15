package plus_example;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int length, width;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로의 길이 : ");
		length = scanner.nextInt();
		
		System.out.print("세로의 길이 : ");
		width = scanner.nextInt();
		
		int area = length*width;
		System.out.println("면적 : " + area);
	}

}
