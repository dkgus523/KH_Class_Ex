package plus_if_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proc02 {

	public static void main(String[] args)throws IOException {
		System.out.println("2���� ������ �Է��Ͻʽÿ�.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int res1 = Integer.parseInt(str1);
		
		String str2 = br.readLine();
		int res2 = Integer.parseInt(str2);
		
		if (res1 == res2) {
			System.out.println( "�� ���ڴ� �����ϴ�.");
		} else if(res1 < res2) {
			System.out.println( res1 + "���� " + res2 + "�� Ů�ϴ�.");
		} else {
			
		}

	}

}
