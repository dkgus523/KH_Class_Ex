package practice;

import java.util.Scanner;

public class CalssRollDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu =0;
		String[] coursename;
		coursename[0] = "�ڹ�";
		coursename[1] = "c���";
		coursename[2] = "c++";
		
		String name;
		int number = 0;
		
		System.out.print("�������� �Է��ϼ��� : ");
		//�Է��ϴ� ���̶� �Էµ��ִ� ���̶� ���ؼ� ������ �߰�
		for(int i=0; i<coursename.length; i++) {
			if(coursename[i].equals(coursename[i]))
		}

		
		System.out.println("���ϴ� ������ �����ϼ���: (1)�߰� (2)ã�� (3)����");
		menu = scan.nextInt();
		
		while(true) {
			switch(menu) {
			case 1:
				System.out.print("�߰��ϴ� �л��� �й��� �Է��ϼ���:");
				number = scan.nextInt();
				System.out.print("�߰��ϴ� �л��� �̸��� �Է��ϼ���:");
				name = scan.next();
			}
		}
	}

}
