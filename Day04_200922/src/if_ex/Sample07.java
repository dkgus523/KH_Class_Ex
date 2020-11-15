package if_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample07 {

	public static void main(String[] args) throws IOException {
		System.out.println("a 혹은 b를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char res = str.charAt(0);
		
		switch(res) {
		case 'a':
			System.out.println("a이 입력되었습니다.");
			break;
		case 'b':
			System.out.println("b가 입력되었습니다.");
			break;
		case 'c':
			System.out.println("a 혹은 b를 입력하십시오.");
			break;
		}

	}

}
