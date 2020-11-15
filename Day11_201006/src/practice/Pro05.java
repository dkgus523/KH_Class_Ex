package practice;

import java.util.Scanner;

class Date {
	int year, month, day;
	
	void print1(){
		Scanner scan = new Scanner(System.in);
		month = scan.nextInt();
		day = scan.nextInt();
		System.out.println("날짜는 : " + year + "." + month + "." + day );
		print2();
	}
	void print2() {
		System.out.println("날짜는 : " + month + " " + day + ", " + year);
	}
	
}
public class Pro05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d;
		d = new Date();
		d.year = 2012;
		d.month = 9;
		d.day = 5;
		d.print1();
	}

}
