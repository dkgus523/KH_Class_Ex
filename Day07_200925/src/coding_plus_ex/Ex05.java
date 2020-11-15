package coding_plus_ex;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("사각형의 가로를 입력하시오 : ");
		int w = scanner.nextInt();
		
		System.out.print("사각형의 세로를 입력하세요 : ");
		int h = scanner.nextInt();
		
		System.out.println("사각형의 넓이는 " + w*h);
		System.out.println("사각형의 둘레는 " +  (w+h)*2);
	}

}
