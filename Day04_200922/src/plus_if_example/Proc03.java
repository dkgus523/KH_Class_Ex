package plus_if_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proc03 {

	public static void main(String[] args) throws IOException {
		System.out.println("0 에서 10까지의 수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(0 < res && res <10) {
			System.out.println( "정답입니다.");
		} else {
			System.out.println( "오답입니다.");
		}

	}

}
