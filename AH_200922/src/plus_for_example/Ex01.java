package plus_for_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("1번 정수를 입력 : ");
		String str1 = br.readLine();
		int res1 = Integer.parseInt(str1);
		
		System.out.print("2번 정수를 입력 : ");
		String str2 = br.readLine();
		int res2 = Integer.parseInt(str2);
		
		
		if(res1 == res2) {
			System.out.println("두 수는 Same");
		} else {
			System.out.println("두 수는 Different");
		}
		
		
	}

}
