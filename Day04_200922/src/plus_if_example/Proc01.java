package plus_if_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proc01 {

	public static void main(String[] args) throws IOException {
		System.out.println("������ �Է��Ͻʽÿ�.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(res % 2 == 0) {
			System.out.println( res + "�� ¦���Դϴ�.");
		} else {
			System.out.println( res + "�� Ȧ���Դϴ�.");
		}

	}

}
