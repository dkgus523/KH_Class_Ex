package plus_example;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int num=1; num<5; num++) {
		
			String name;
			int  hw, bonus;
			
			System.out.printf("\n%d .", num);
			
			System.out.print("이름 : ");
			name = scanner.next();
		
			System.out.print("과제 : ");
			hw = scanner.nextInt();
		
			System.out.print("보너스 : ");
			bonus = scanner.nextInt();
		
			System.out.print("합계 : "+ (hw+bonus));
		
		}
		
	}

}
