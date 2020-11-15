package for_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample09 {

	public static void main(String[] args) throws IOException{
		System.out.println("몇 번째에서 루프를 빠져 나가시겠습니까? ( 1 ? 10) ");
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1; i<=10; i++) {
			System.out.println(i + "번째 처리입니다.");
			if ( i == res)
				break;
		}
		for(int i=1; i<=10; i++) {
			if(i == res)
				continue;
			System.out.println(i + "번째 처리입니다.");
		}
	}

}
