package plus_if_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proc01 {

	public static void main(String[] args) throws IOException {
		System.out.println("정수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(res % 2 == 0) {
			System.out.println( res + "는 짝수입니다.");
		} else {
			System.out.println( res + "는 홀수입니다.");
		}

	}

}
