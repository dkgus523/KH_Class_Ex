package practice;

import java.util.Scanner;

class Movie {
	int year, score; 
	String pd, title;
	void print() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("영화 제목 : ");
		title = scan.next();
		
		System.out.print("영화 평점 : ");
		score = scan.nextInt();
		
		System.out.print("영화 감독 : ");
		pd = scan.next();
		
		System.out.print("발표된 연도 : ");
		year = scan.nextInt();
		
		System.out.println("영화 정보 >>" + title + ", " + score + ", " + pd + ", " + year);
	}
}
public class Pro06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie();
		m.year = 2012;
		m.title = "Total Recall";
		m.print();
	}

}
