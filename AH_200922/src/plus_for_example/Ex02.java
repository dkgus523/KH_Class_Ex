package plus_for_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args)throws IOException {
		System.out.print("������ �Է� : ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(res % 2 == 0) {
			System.out.println( "�Է��� ���� ¦���Դϴ�.");
		} else {
			System.out.println( "�Է��� ���� Ȧ���Դϴ�.");
		}
		
	}

}
