package plus_all_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class All_Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp;
		
		System.out.print("���� ���� �Է��Ͻÿ� : ");
		String str1 = br.readLine();
		int first = Integer.parseInt(str1);
		
		System.out.print("���� ���� �Է��Ͻÿ� : ");
		String str2 = br.readLine();
		int second = Integer.parseInt(str2);
		
		System.out.print("���� ���� �Է��Ͻÿ� : ");
		String str3 = br.readLine();
		int third = Integer.parseInt(str3);
		
		if(second > first && second > third) {
			temp = first;
			first = second;
			second = temp;
		} else if(third > first && third > second){
			temp = first;
			first = third;
			third = temp;
		}
		if(third > second) {
			temp = second;
			second = third;
			third = temp;
		}
		
		System.out.println("���ĵ� ���� : " + first +" " + second + " " +third);
	}

}
