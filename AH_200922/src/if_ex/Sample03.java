package if_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample03 {

	public static void main(String[] args) throws IOException {
		System.out.println("정수를 입력하시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(res == 1) {
			System.out.println("1이 입력되었습니다.");
		} else {
			System.out.println("1 이외의 값이 입력되었습니다.");
			//if(res == 1)
		}

	}

}
