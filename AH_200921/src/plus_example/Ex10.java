package plus_example;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int itemPrice ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ ����(1,000�� ����)�� �Է��ϼ��� : ");
		itemPrice = scanner.nextInt();
		
		int change = 1000 - itemPrice;
		System.out.println("�Ž����� : " + change);
		
		int coin500, coin100, coin50, coin10, coin5, coin1;

		coin500 = change/500;
		change = change % 500;
		
		coin100 = change/100;
		change = change % 100;
	
		coin50 = change/50;
		change = change % 50;
		
		coin10 = change/10;
		change = change % 10;
		
		coin5 = change/5;
		change = change % 5;

		coin1 = change/1;
		
		System.out.println("500��¥�� ���� ���� : " + coin500);
		System.out.println("100��¥�� ���� ���� : " + coin100);
		System.out.println("50��¥�� ���� ���� : "  + coin50);		
		System.out.println("10��¥�� ���� ���� : " + coin10);		
		System.out.println("5��¥�� ���� ���� : " + coin5);		
		System.out.println("1��¥�� ���� ���� : " + coin1);
		
		
		
		
		
		
	}

}
