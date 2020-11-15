package plus_example;

import java.util.ArrayList;
import java.util.Scanner;

class Student {

	private String name;
	private int num;
	
	public Student(String name, int num) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}
public class Student_Info_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> arr = new ArrayList<Student>();
		String ans;
		
		
		
		while(true) {
			System.out.println("[1]학생정보 저장 [2]학생조회");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				System.out.print("학생 이름 입력 >>");
				String name = scanner.next();
			
				System.out.print("학번 입력 >>");
				int num = scanner.nextInt();
			
				Student std = new Student(name, num);
				arr.add(std);
				
			} else if(choice == 2) {
				System.out.print("검색할 학생 이름 입력 >>");
				String searchName = scanner.next();
			
				if(arr.size() != 0) {
					for(int i=0; i<arr.size(); i++) {
						if(searchName.equals(arr.get(i).getName())){
							System.out.println(searchName + "의 학번은 " + arr.get(i).getNum() + "입니다.");
						}
					}
				} else {
					System.out.println("해당 학생 정보가 존재하지 않습니다. 프로그램을 종료합니다.");
				}
			} else {
				System.out.print("메뉴 번호를 확인하시고 다시 입력해주세요.");
			}
			
			System.out.println("계속하시겠습니까? [Y/N]");
			ans = scanner.next();
			if (ans.equals("Y") ||  ans.equals("y"))
				System.out.println(" ");
			else if(ans.equals("N") ||  ans.equals("n")) {
				System.out.println("학생 조회 서비스를 종료하겠습니다");
				break;
			}
		} 

	}

}
