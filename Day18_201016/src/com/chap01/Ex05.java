package com.chap01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		ArrayList<Info> list = new ArrayList<Info>();
		int menu = 0;
		int count = 0;
		
		System.out.println("�޴��� �����ϼ���.|1.�Է�|2.���|3.����");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:			
				Info in = new Info();
				System.out.print("�̸� : ");
				in.name = scan.next();
				System.out.print("���� : ");
				in.number = scan.nextInt();
				list.add(in); //�迭�� �������� ���
				count++; 
			
			case 2:
				for(int i=0; i<count; i++) {
					System.out.println(list.get(i).name); //�̸�
					System.out.println(list.get(i).number); //����
				}
				
			case 3:
				System.out.println("���α׷� ����");
				break;
			}
			
			break;
			
		}
		
		
	
	}

}
