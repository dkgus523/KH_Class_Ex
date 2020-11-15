package plus_all_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class All_Ex03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("영문자 하나를 입력하시오 : ");
		String str = br.readLine();
		
		String temp = str.toUpperCase();  //str.toUpperCase -> 문자열 str에 있는 소문자를 대문자로 바꾸어 반환해주는 메소드
		
		switch(temp.charAt(0)){   //str.charAt() ->문자열 str에서 i번째 인덱스에 있는 문자 하나를 반환하는 메소드
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :
			System.out.println("입력하신 영문자는 모음입니다.");
				break;
			default :
				System.out.println("입력하신 영문자는 자음입니다.");
		}
	}

}
