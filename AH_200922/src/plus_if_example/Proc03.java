package plus_if_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proc03 {

	public static void main(String[] args) throws IOException {
		System.out.println("0 ���� 10������ ���� �Է��Ͻʽÿ�.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(0 < res && res <10) {
			System.out.println( "�����Դϴ�.");
		} else {
			System.out.println( "�����Դϴ�.");
		}

	}

}
