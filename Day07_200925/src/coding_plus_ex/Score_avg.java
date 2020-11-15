package coding_plus_ex;

import java.util.Scanner;

public class Score_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] user = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		int i ;
		for( i = 0; i<user.length; i++) {
			System.out.printf("성적을 입력하시오 : ", user[i] );
			user[i] = scanner.nextInt();
		}
		
		
		int avg = (user[0] + user[1] + user[2] + user[3] + user[4])/user.length;
		System.out.println("평균 성적은  " + avg + "입니다."  );
	}

}
