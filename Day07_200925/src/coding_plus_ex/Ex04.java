package coding_plus_ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int i = scanner.nextInt();
		
		if(i % 2 == 0)
			System.out.println("입력된 정수는 짝수입니다.");
		else
			System.out.println("입력된 정수는 홀수입니다.");
		
		System.out.print("프로그램이 종료되었습니다.");
		
	}

}
