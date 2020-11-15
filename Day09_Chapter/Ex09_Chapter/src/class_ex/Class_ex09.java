package class_ex;

import java.util.Scanner;

public class Class_ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String id = "cindy0000";
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		s = scan.next();
		
		if(s.equals(id))
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
	}

}
