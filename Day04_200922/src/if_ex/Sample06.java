package if_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample06 {

	public static void main(String[] args) throws IOException {
		System.out.println("������ �Է��Ͻʽÿ�.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res) {
		case 1:
			System.out.println("1�� �ԷµǾ����ϴ�.");
			break;
		case 2:
			System.out.println("2�� �ԷµǾ����ϴ�.");
			break;
		case 3:
			System.out.println("1 Ȥ�� 2�� �Է��Ͻʽÿ�.");
			break;
		}

	}

}
