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
		
		System.out.printf("학생들의 성적 목록 : %d %d %d %d %d \n" , a, b, c, d, e );
		
		int hap = a + b + c + b + d + e;
		System.out.println("학생들의 성적의 총 합계 : " + hap);
		
		int avg = hap/5;
		System.out.println("학생들의 성적의 총 평균 : " + avg);
		*/
		
		//-------------------------------------------------------------------- 변수 최소 사용
		
		int[] score = new int[5];
		
		for(int i=0; i<5; i++) {
				score[i] = scanner.nextInt();
				if(score[i] > 100){
					System.out.println("점수는 100이하여야 합니다.");
					i--;
					continue;
				}			
			}
		
		
		System.out.printf("학생들의 성적 목록 : %d %d %d %d %d \n" ,score[0] , score[1] , score[2] , score[3] , score[4]);		
		System.out.println("학생들의 성적의 총 합계 : " +(score[0] + score[1] + score[2] + score[3] + score[4]) );
		System.out.println("학생들의 성적의 총 평균 : " + (score[0] + score[1] + score[2] + score[3] + score[4])/5);
		
		
	}
}
