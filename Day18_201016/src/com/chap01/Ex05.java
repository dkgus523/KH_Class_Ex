package com.chap01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		ArrayList<Info> list = new ArrayList<Info>();
		int menu = 0;
		int count = 0;
		
		System.out.println("메뉴를 선택하세요.|1.입력|2.출력|3.종료");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:			
				Info in = new Info();
				System.out.print("이름 : ");
				in.name = scan.next();
				System.out.print("나이 : ");
				in.number = scan.nextInt();
				list.add(in); //배열에 넣은것을 출력
				count++; 
			
			case 2:
				for(int i=0; i<count; i++) {
					System.out.println(list.get(i).name); //이름
					System.out.println(list.get(i).number); //숫자
				}
				
			case 3:
				System.out.println("프로그램 종료");
				break;
			}
			
			break;
			
		}
		
		
	
	}

}
