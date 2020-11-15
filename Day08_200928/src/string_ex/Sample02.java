package string_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("영문자를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String stru = str.toUpperCase();
		String str1 = str.toLowerCase();
	
		System.out.println("대문자로 변환하면 " + stru);
		System.out.println("소문자로 변환하면 " + str1);
	}

}
