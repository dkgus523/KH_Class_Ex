package plus_example;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int Base, Height;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�غ��� ���� : ");
		Base = scanner.nextInt();
		
		System.out.print("������ ���� : ");
		Height = scanner.nextInt();
		
		int Area = (Base*Height)/2;
		System.out.println("�����ﰢ���� ���� : " + Area);
		
	}

}
