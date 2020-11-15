package plus_example;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int preLabScore, labScore, postLabScore;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("실습 전 과제 점수 : ");
		preLabScore = scanner.nextInt();
		
		System.out.print("실습 과제 점수 : ");
		labScore = scanner.nextInt();
		
		System.out.print("실습 후 과제 점수 : ");
		postLabScore = scanner.nextInt();
		
		int finalLabScore = (preLabScore/20 + postLabScore/30)*30 + preLabScore/25 * 40;
		System.out.println("최종 실습점수 : " + finalLabScore);
	}

}
