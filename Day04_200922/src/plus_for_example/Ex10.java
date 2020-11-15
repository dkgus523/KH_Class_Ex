package plus_for_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 값을 입력하시오(1회) : ");
		String str1 = br.readLine();
		int res1 = Integer.parseInt(str1);
		
		System.out.print("정수 값을 입력하시오(2회) : ");
		String str2 = br.readLine();
		int res2 = Integer.parseInt(str2);
		
		System.out.print("정수 값을 입력하시오(3회) : ");
		String str3 = br.readLine();
		int res3 = Integer.parseInt(str3);
		
		if(res1>res2 && res1>res3) {
			System.out.println("최대 값은 "+ res1 + "입니다.");
		} else if(res2>res1 && res2>res3) {
			System.out.println("최대 값은 "+ res2 + "입니다.");
		} else {
			System.out.println("최대 값은 "+ res3 + "입니다.");
		}
		
	}
}
