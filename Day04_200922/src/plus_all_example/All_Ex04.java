package plus_all_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class All_Ex04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		String str1 = br.readLine();
		int k = Integer.parseInt(str1);
		
		System.out.print("�����Ը� �Է��Ͻÿ� : ");
		String str2 = br.readLine();
		int m = Integer.parseInt(str2);
		
		double weight = (k-100)*0.9;
		
		if(m>weight) {
			System.out.println("��ü���Դϴ�.");
		} else if( m < weight) {
			System.out.println("��ü���Դϴ�.");
		} else {
			System.out.println("ǥ���Դϴ�.");
		}

	}

}
