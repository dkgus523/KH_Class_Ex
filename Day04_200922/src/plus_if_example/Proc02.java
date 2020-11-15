package plus_if_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proc02 {

	public static void main(String[] args)throws IOException {
		System.out.println("2개의 정수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int res1 = Integer.parseInt(str1);
		
		String str2 = br.readLine();
		int res2 = Integer.parseInt(str2);
		
		if (res1 == res2) {
			System.out.println( "두 숫자는 같습니다.");
		} else if(res1 < res2) {
			System.out.println( res1 + "보다 " + res2 + "이 큽니다.");
		} else {
			
		}

	}

}
