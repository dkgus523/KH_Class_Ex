package plus_example;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int Base, Height;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변의 길이 : ");
		Base = scanner.nextInt();
		
		System.out.print("높이의 길이 : ");
		Height = scanner.nextInt();
		
		int Area = (Base*Height)/2;
		System.out.println("직각삼각형의 면적 : " + Area);
		
	}

}
