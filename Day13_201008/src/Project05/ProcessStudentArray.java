package Project05;

import java.util.Scanner;

public class ProcessStudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stdArray;
		String[] name = new String[4];
		int[] number = new int[4];
		int i;
		
		Scanner scan = new Scanner(System.in);
		stdArray = new Student[4];
		
		
		for(i = 0; i<stdArray.length; i++) {
			System.out.print("학생의 이름을 입력하세요 : ");
			name[i] = scan.next();
			System.out.print("학생의 학번을 입력하세요 : ");
			number[i] = scan.nextInt();
		}
		
		
		//
		System.out.println("학번" + "\t\t" + "이름");
		System.out.println(" ");
		
		for(i=0; i<stdArray.length; i++) {
			System.out.println(number[i] + "\t\t" + name[i]);
		}
	}

}
