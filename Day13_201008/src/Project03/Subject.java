package Project03;

import java.util.Scanner;

public class Subject {
	//변수 선언
	String[] sj;
	int count;
	Student[] stud;
	
	Scanner scan = new Scanner(System.in);
	
	public Subject() {
		//초기화를 생성자에서 해줬다.
		sj = new String[3];  //과목
		count = 0;
		stud = new Student[50]; //학생
	}
	void run() {
		inputSubject();
		menu();
	}
	//과목명 입력
	void inputSubject() {
		for(int i = 0; i < sj.length; i++) {
			System.out.print("과목명을 입력하세요: ");
			sj[i] = scan.next();
		}
	} 
	//메뉴
	void menu() {
		while(true) {
			System.out.println("원하는 메뉴를 선택하세요 : ");
			System.out.println("1. 학생 이름 추가");
			System.out.println("2. 학생 목록 표시");
			System.out.println("3. 프로그램 종료");
			int c = scan.nextInt();
			//과목명 입력 후 학생 입력
			if(c == 1) {
				System.out.print("학생을 추가하실 과목명을 입력하세요: ");
				String s = scan.next();
				
				for(int i = 0; i < sj.length; i++) {
					if(s.equals(sj[i])) {
						System.out.print("추가하실 학생의 이름을 입력하세요: ");
						stud[count] = new Student();
						stud[count].name = scan.next();
						stud[count].sb = i;
						
						count++;
					}
				}
			}
				//학생 목록 출력
				if(c == 2) {
					System.out.println("----------교과목별 학생 목록----------");
					for( int i = 0; i<count; i++) {
						if(stud[i].sb == 0)
							System.out.println(sj[0] + ":" + stud[i].name);
						if(stud[i].sb == 1)
							System.out.println(sj[0] + ":" + stud[i].name);
						if(stud[i].sb == 2)
							System.out.println(sj[0] + ":" + stud[i].name);
					}
				}
				//프로그램 종료
				if(c == 3) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject s = new Subject();
		s.run();
	}

}
