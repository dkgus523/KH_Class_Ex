package plus_example;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//sol1
		/*int eng, pro, math, com;
		
		System.out.print("���۹� ������ ���� : ");
		eng = scanner.nextInt();
		System.out.print("���α׷��� ������ ���� : ");
		pro = scanner.nextInt();
		System.out.print("�̻���� ������ ���� : ");
		math = scanner.nextInt();
		System.out.print("��ǻ�ͱ��� ������ ���� : ");
		com = scanner.nextInt();
		
		double avg = (eng+pro+math+com)/4;
		System.out.printf("��� ���� : %4.2f ", avg);*/
		
		//sol2
		int jumsu = 0;
		
		System.out.print("���۹� ������ ���� : ");
		jumsu = jumsu + scanner.nextInt();
		System.out.print("���α׷��� ������ ���� : ");
		jumsu = jumsu + scanner.nextInt();
		System.out.print("�̻���� ������ ���� : ");
		jumsu = jumsu + scanner.nextInt();
		System.out.print("��ǻ�ͱ��� ������ ���� : ");
		jumsu = jumsu + scanner.nextInt();
		
		double avg = (jumsu+jumsu+jumsu+jumsu)/4;
		System.out.printf("��� ���� : %4.2f ", avg);
		
	}

}
