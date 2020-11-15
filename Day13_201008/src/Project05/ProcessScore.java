package Project05;

import java.util.Scanner;

public class ProcessScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//10명의 학생들의 점수를 저장하는 배열
		int[] stu = new int[10];
		int[] score = new int[10]; 
		int hap = 0;
		double avg = 0.0;
			
		//점수들의 합계를 구한다.
		for(int i=0; i<10; i++) {
			score[i] = scan.nextInt();
			hap += score[i];
		}
		System.out.println("학생들 점수의 합계는 >> " + hap);
		
		//평균을 계산한다.
		avg = hap/stu.length;
		System.out.println("학생들 점수의 평균은 >> " + avg);
		
		//각 점수가 평균 이상인지 혹은 평균보다 작은지를 출력한다.
		for(int i =0; i<10; i++) {
			if(avg <= score[i]) {
				System.out.println((i+1) +  "번째 점수는 평균이상입니다.");
			} else {
				System.out.println((i+1) + "번째 점수는 평균이하입니다.");
			}
		}
		
	}

}
