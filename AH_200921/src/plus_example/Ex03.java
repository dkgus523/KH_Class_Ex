package plus_example;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int num=1; num<5; num++) {
		
			String name;
			int  hw, bonus;
			
			System.out.printf("\n%d .", num);
			
			System.out.print("�̸� : ");
			name = scanner.next();
		
			System.out.print("���� : ");
			hw = scanner.nextInt();
		
			System.out.print("���ʽ� : ");
			bonus = scanner.nextInt();
		
			System.out.print("�հ� : "+ (hw+bonus));
		
		}
		
	}

}
