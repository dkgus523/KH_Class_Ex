package plus_example;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int preLabScore, labScore, postLabScore;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ǽ� �� ���� ���� : ");
		preLabScore = scanner.nextInt();
		
		System.out.print("�ǽ� ���� ���� : ");
		labScore = scanner.nextInt();
		
		System.out.print("�ǽ� �� ���� ���� : ");
		postLabScore = scanner.nextInt();
		
		int finalLabScore = (preLabScore/20 + postLabScore/30)*30 + preLabScore/25 * 40;
		System.out.println("���� �ǽ����� : " + finalLabScore);
	}

}
