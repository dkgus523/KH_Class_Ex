package string_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하십시오. ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		
		System.out.println("안녕하십니까. 검색어를 입력하십시오.");
		
		String str2 = br.readLine();
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch);
		
		if(num != -1)
			System.out.println(str1 + "  의" + (num+1) + "번째에서  ' " +  ch + " '발견");
		else
			System.out.println(str1 + "에서 '" + ch + "' 을(를) 찾을 수 없었습니다.");
		
	}

}
