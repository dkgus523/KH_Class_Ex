package if_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample07 {

	public static void main(String[] args) throws IOException {
		System.out.println("a Ȥ�� b�� �Է��Ͻʽÿ�.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char res = str.charAt(0);
		
		switch(res) {
		case 'a':
			System.out.println("a�� �ԷµǾ����ϴ�.");
			break;
		case 'b':
			System.out.println("b�� �ԷµǾ����ϴ�.");
			break;
		case 'c':
			System.out.println("a Ȥ�� b�� �Է��Ͻʽÿ�.");
			break;
		}

	}

}
