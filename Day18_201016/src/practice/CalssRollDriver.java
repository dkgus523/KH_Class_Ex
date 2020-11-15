package practice;

import java.util.Scanner;

public class CalssRollDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu =0;
		String[] coursename;
		coursename[0] = "자바";
		coursename[1] = "c언어";
		coursename[2] = "c++";
		
		String name;
		int number = 0;
		
		System.out.print("교과명을 입력하세요 : ");
		//입력하는 값이랑 입력되있는 값이랑 비교해서 같으면 추가
		for(int i=0; i<coursename.length; i++) {
			if(coursename[i].equals(coursename[i]))
		}

		
		System.out.println("원하는 연산을 선택하세요: (1)추가 (2)찾기 (3)종료");
		menu = scan.nextInt();
		
		while(true) {
			switch(menu) {
			case 1:
				System.out.print("추가하는 학생의 학번을 입력하세요:");
				number = scan.nextInt();
				System.out.print("추가하는 학생의 이름을 입력하세요:");
				name = scan.next();
			}
		}
	}

}
