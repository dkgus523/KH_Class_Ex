package project;

import java.util.Scanner;

public class SalesReport {
	
	public static void main(String[] args) {
		int salesman_number;
		String[] name;		
		int[] price;
		
			Scanner scan = new Scanner(System.in);
			
			System.out.print("�Ǹſ����� ���� �Է��ϼ��� : ");
			salesman_number = scan.nextInt();
			
			//�Է¹��� �Ǹſ����� ����ŭ �Ǹſ� �̸��� �ֱ�
			name = new String[salesman_number];
			price = new int[salesman_number];
			
			for(int i = 0; i<salesman_number; i++) {
				System.out.println("�Ǹſ� " + (i+1) + "�� �����͸� �Է��ϼ���.");
				System.out.print("�Ǹſ��� �̸��� �Է��ϼ��� : ");
				name[i] = scan.next();
				System.out.print("�Ǹſ��� �Ǹž��� �Է��ϼ��� : ");
				price[i] = scan.nextInt();				
			}
			for(int i = 0; i<salesman_number; i++) {
				int sum = 0;
				int avg = 0;
				sum += price[i];
				avg = sum/salesman_number;
				System.out.print("�Ǹſ����� ��� �Ǹž� = " + avg);
			}
			for(int i = 0; i<salesman_number; i++) {
				int tmp = 0;
				tmp = price[i];
				price[i] = price[i+1];		
				price[i+1] = tmp;
				System.out.print("�Ǹſ����� �ִ� �Ǹž� = " + tmp);
			}
			//System.out.print("�ִ� �Ǹž��� �޼��� �Ǹſ�");
			//System.out.print("�̸� :" + );
			//System.out.print("�Ǹž� :" + );
		
		

	}

}
