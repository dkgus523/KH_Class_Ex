package plus_ex;

import java.util.Scanner;

public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lname ;
		String fname ;
		
		//객체 참조변수
		Person person1, person2;
		
		Scanner scan = new Scanner(System.in);
		
		//성을 입력하세요 
		System.out.print("성을 입력하세요 :");
		lname = scan.next();
		//이름을 입력하세요
		System.out.print("이름을 입력하세요 :");
		fname = scan.next();
		//Person객체를 생성하여 person1이 가리키게 한다.
		person1 = new Person();
		
		person1.lastName = lname;  //person1 객체의 성을 lname으로 한다
		person1.firstName = fname;  //person1 객체의 이름을 fname으로 한다

		//person1 객체의 성, 이름과 성명의 길이를 출력한다.
		System.out.println("성 : " + person1.getLastName() + " 이름 :" + person1.getFirstName() + " \n성명의 길이는 : " + person1.getLength());
		
		//위와 같음
		System.out.print("성을 입력하세요 :");
		lname = scan.next();
		System.out.print("이름을 입력하세요 :");
		fname = scan.next();
		
		person2 = new Person();
		
		person2.lastName = lname;
		person2.firstName = fname;
		
		System.out.println("성 : " + person2.getLastName() + " 이름 : " + person2.getFirstName() + " \n성명의 길이는 : " + person2.getLength());
		
	}

}
