package plus_example;

import java.util.ArrayList;
import java.util.Scanner;

class Student1{
	String name;
	int age;
	String addr;
	int number;

	public Student1(String name, int age, String addr, int number) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.number = number;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
public class Student_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		String addr;
		int number;
		int i=0;
		
		ArrayList<Student1> st = new ArrayList<Student1>();
		
		while(i != 3) {
			System.out.println("정보입력 -> 1 , 정보 출력 -> 2 , 종료 -> 3");
			Scanner sc = new Scanner(System.in);
			i=sc.nextInt();
			switch(i) {
			case 1:
				Scanner n = new Scanner(System.in);
				
				System.out.print("이름을 입력하세요 : ");
				name = n.next();
				
				System.out.print("나이를 입력하세요 : ");
				age = n.nextInt();
					
				System.out.print("주소를 입력하세요 : ");
				addr = n.next();
				
				System.out.print("번호를 입력하세요 : ");
				number = n.nextInt();
				
				st.add(new Student1(name, age, addr, number));  
				System.out.println("입력 되었습니다.");
				break;
				
			case 2:
				Scanner pn = new Scanner(System.in);
				System.out.print("출력할 이름을 입력하세요 : ");
				String printName = pn.next();
				for (Student1 p : st)
					if(p.name.equals(printName)){
						System.out.println("-------정보출력-------");
						System.out.println("이름 : " + p.name);
						System.out.println("나이 : " + p.age);
						System.out.println("주소 : " + p.addr);
						System.out.println("번호 : " + p.number);
						System.out.println("------------------------");
					} else {
						System.out.println("저장된 정보 없음");
					}
					break;
			}
						
		}
		System.out.println("종료");
	}

}


