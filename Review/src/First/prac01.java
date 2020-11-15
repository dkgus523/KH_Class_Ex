package First;

import java.util.Scanner;

public class prac01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 >> ");
			
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.print("학생수 >");
				studentNum = scan.nextInt();
				scores = new int [studentNum];
			} else if(menu == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("score[" + i + "] >");
					scores[i] = scan.nextInt();
				}
			} else if(menu == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("score[" + i + "] : " + scores[i]);
				}
				
			} else if(menu == 4) {
				int max = 0;
				int hap = 0;
				double avg =0.0;
				for(int i=0; i<scores.length; i++) {
					max = (scores[i]>max? scores[i]:max);
					hap += scores[i]; 
				}
				avg = (double)hap/studentNum;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if(menu == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
