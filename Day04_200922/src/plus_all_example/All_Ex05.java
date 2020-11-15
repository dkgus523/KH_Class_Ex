package plus_all_example;

import java.util.Scanner;

public class All_Ex05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("세개의 숫자를 입력하시오.");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		
		
		if(n1 < n2) {
			if(n1 < n3)
				System.out.println("세 숫자 중 가장 작은 값은 " +  n1 + "이다.");
			else
				System.out.println("세 숫자 중 가장 작은 값은 " + n3 + "이다.");
		}
		else {
			if(n2 < n3)
				System.out.println("세 숫자 중 가장 작은 값은 " + n2 + "이다.");
			else
				System.out.println("세 숫자 중 가장 작은 값은 " + n3 + "이다.");
		}

	}

}
