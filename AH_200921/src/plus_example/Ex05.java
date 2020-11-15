package plus_example;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int upperside, lowerside, height;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("윗변의 길이 : ");
		upperside = scanner.nextInt();
		
		System.out.print("아랫변의 길이 : ");
		lowerside = scanner.nextInt();
		
		System.out.print("높이 : ");
		height = scanner.nextInt();
		
		int area = (upperside + lowerside)*height/2;
		System.out.println("면적 : " + area);
	}

}
