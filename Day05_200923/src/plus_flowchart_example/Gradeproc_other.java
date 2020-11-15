package plus_flowchart_example;

public class Gradeproc_other {

	public static void main(String[] args) {
		int[] score = new int[5];
		
		int sum = 0;
		score[0] = 80;
		score[1] = 90;
		score[2] = 75;
		score[3] = 55;
		score[4] = 30;
		
		for(int i = 0; i<5; i++) {
			sum = sum + score[i];
		}
		System.out.println("학생들의 성적의 총 합계 : " + sum);
		
		int avg = sum/5;
		
		System.out.println("학생들의 성적의 총 평균 : " + avg);
	}

}
