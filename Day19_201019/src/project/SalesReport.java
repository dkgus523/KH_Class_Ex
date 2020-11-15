package project;

import java.util.Scanner;

public class SalesReport {
	
	public static void main(String[] args) {
		int salesman_number;
		String[] name;		
		int[] price;
		
			Scanner scan = new Scanner(System.in);
			
			System.out.print("판매원들의 수를 입력하세요 : ");
			salesman_number = scan.nextInt();
			
			//입력받은 판매원들의 수만큼 판매원 이름에 넣기
			name = new String[salesman_number];
			price = new int[salesman_number];
			
			for(int i = 0; i<salesman_number; i++) {
				System.out.println("판매원 " + (i+1) + "의 데이터를 입력하세요.");
				System.out.print("판매원의 이름을 입력하세요 : ");
				name[i] = scan.next();
				System.out.print("판매원의 판매액을 입력하세요 : ");
				price[i] = scan.nextInt();				
			}
			for(int i = 0; i<salesman_number; i++) {
				int sum = 0;
				int avg = 0;
				sum += price[i];
				avg = sum/salesman_number;
				System.out.print("판매원들의 평균 판매액 = " + avg);
			}
			for(int i = 0; i<salesman_number; i++) {
				int tmp = 0;
				tmp = price[i];
				price[i] = price[i+1];		
				price[i+1] = tmp;
				System.out.print("판매원들의 최대 판매액 = " + tmp);
			}
			//System.out.print("최대 판매액을 달성한 판매원");
			//System.out.print("이름 :" + );
			//System.out.print("판매액 :" + );
		
		

	}

}
