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
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("���� >> ");
			
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.print("�л��� >");
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
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avg);
			} else if(menu == 5) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}

}
