package plus_all_example;

import java.util.Scanner;

public class All_Ex05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("������ ���ڸ� �Է��Ͻÿ�.");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		
		
		if(n1 < n2) {
			if(n1 < n3)
				System.out.println("�� ���� �� ���� ���� ���� " +  n1 + "�̴�.");
			else
				System.out.println("�� ���� �� ���� ���� ���� " + n3 + "�̴�.");
		}
		else {
			if(n2 < n3)
				System.out.println("�� ���� �� ���� ���� ���� " + n2 + "�̴�.");
			else
				System.out.println("�� ���� �� ���� ���� ���� " + n3 + "�̴�.");
		}

	}

}
