package plus_for_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� ���� �Է��Ͻÿ�(1ȸ) : ");
		String str1 = br.readLine();
		int res1 = Integer.parseInt(str1);
		
		System.out.print("���� ���� �Է��Ͻÿ�(2ȸ) : ");
		String str2 = br.readLine();
		int res2 = Integer.parseInt(str2);
		
		System.out.print("���� ���� �Է��Ͻÿ�(3ȸ) : ");
		String str3 = br.readLine();
		int res3 = Integer.parseInt(str3);
		
		if(res1>res2 && res1>res3) {
			System.out.println("�ִ� ���� "+ res1 + "�Դϴ�.");
		} else if(res2>res1 && res2>res3) {
			System.out.println("�ִ� ���� "+ res2 + "�Դϴ�.");
		} else {
			System.out.println("�ִ� ���� "+ res3 + "�Դϴ�.");
		}
		
	}
}
