package plus_for_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("1�� ������ �Է� : ");
		String str1 = br.readLine();
		int res1 = Integer.parseInt(str1);
		
		System.out.print("2�� ������ �Է� : ");
		String str2 = br.readLine();
		int res2 = Integer.parseInt(str2);
		
		
		if(res1 == res2) {
			System.out.println("�� ���� Same");
		} else {
			System.out.println("�� ���� Different");
		}
		
		
	}

}
