package plus_all_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class All_Ex03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �ϳ��� �Է��Ͻÿ� : ");
		String str = br.readLine();
		
		String temp = str.toUpperCase();  //str.toUpperCase -> ���ڿ� str�� �ִ� �ҹ��ڸ� �빮�ڷ� �ٲپ� ��ȯ���ִ� �޼ҵ�
		
		switch(temp.charAt(0)){   //str.charAt() ->���ڿ� str���� i��° �ε����� �ִ� ���� �ϳ��� ��ȯ�ϴ� �޼ҵ�
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :
			System.out.println("�Է��Ͻ� �����ڴ� �����Դϴ�.");
				break;
			default :
				System.out.println("�Է��Ͻ� �����ڴ� �����Դϴ�.");
		}
	}

}
