package plus_flowchart_example;

import java.util.Scanner;

public class Gradeproc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		
		System.out.printf("�л����� ���� ��� : %d %d %d %d %d \n" , a, b, c, d, e );
		
		int hap = a + b + c + b + d + e;
		System.out.println("�л����� ������ �� �հ� : " + hap);
		
		int avg = hap/5;
		System.out.println("�л����� ������ �� ��� : " + avg);
		*/
		
		//-------------------------------------------------------------------- ���� �ּ� ���
		
		int[] score = new int[5];
		
		for(int i=0; i<5; i++) {
				score[i] = scanner.nextInt();
				if(score[i] > 100){
					System.out.println("������ 100���Ͽ��� �մϴ�.");
					i--;
					continue;
				}			
			}
		
		
		System.out.printf("�л����� ���� ��� : %d %d %d %d %d \n" ,score[0] , score[1] , score[2] , score[3] , score[4]);		
		System.out.println("�л����� ������ �� �հ� : " +(score[0] + score[1] + score[2] + score[3] + score[4]) );
		System.out.println("�л����� ������ �� ��� : " + (score[0] + score[1] + score[2] + score[3] + score[4])/5);
		
		
	}
}
