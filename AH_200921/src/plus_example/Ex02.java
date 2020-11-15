package plus_example;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//sol1
		/*int eng, pro, math, com;
		
		System.out.print("영작문 과목의 점수 : ");
		eng = scanner.nextInt();
		System.out.print("프로그래밍 과목의 점수 : ");
		pro = scanner.nextInt();
		System.out.print("이산수학 과목의 점수 : ");
		math = scanner.nextInt();
		System.out.print("컴퓨터구조 과목의 점수 : ");
		com = scanner.nextInt();
		
		double avg = (eng+pro+math+com)/4;
		System.out.printf("평균 점수 : %4.2f ", avg);*/
		
		//sol2
		int jumsu = 0;
		
		System.out.print("영작문 과목의 점수 : ");
		jumsu = jumsu + scanner.nextInt();
		System.out.print("프로그래밍 과목의 점수 : ");
		jumsu = jumsu + scanner.nextInt();
		System.out.print("이산수학 과목의 점수 : ");
		jumsu = jumsu + scanner.nextInt();
		System.out.print("컴퓨터구조 과목의 점수 : ");
		jumsu = jumsu + scanner.nextInt();
		
		double avg = (jumsu+jumsu+jumsu+jumsu)/4;
		System.out.printf("평균 점수 : %4.2f ", avg);
		
	}

}
