package plus_for_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args)throws IOException {
		System.out.print("정수를 입력 : ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(res % 2 == 0) {
			System.out.println( "입력한 수는 짝수입니다.");
		} else {
			System.out.println( "입력한 수는 홀수입니다.");
		}
		
	}

}
