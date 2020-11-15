package Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;



public class Student
{
	public static void main(String[] args) throws IOException
	{
		new Studentmain();
	}
}



class Studentmain extends Check
{
	String[] subject = new String[3];
	// 과목명 저장용 배열
	ArrayList<Studentdata> student = new ArrayList<Studentdata>();
	// 데이터 클래스 집어넣을 거
	
	Studentmain() throws IOException
	{
		SubjectInput();
								// 과목명 입력해서 배열에 넣는 메소드 호출
		Studentdata data;
								// 데이터 받을 클래스변수 선어
		for(;;)
		{
			System.out.println("\n[1]추가\t[2]출력\t[3]종료");
			
			String select = CheckElement("1", "2", "3");
			// 메뉴 선택
			
			if(select.equals("1"))			// 인스턴스 만들어서 add 
			{
				data = new Studentdata(this.subject);
				this.student.add(data);
			}
			else if(select.equals("2"))		// add된 arraylist의 인스턴스 출력
			{
				for(Studentdata std : this.student)
				{
					std.print();
				}
			}
			else if(select.equals("3"))		// 끝났다
			{
				System.out.println("끝");
				break;
			}
		}
	}
	
	void SubjectInput()
	{
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=this.subject.length; i++)
		{
			System.out.print(i + "번 과목을 입력하세요. : ");
			this.subject[i-1] = scan.next();
		}
	}	// 과목명을 입력하는 메소드
}



class Studentdata extends Check
{
	String name, subject;
	// 이름, 과목
	
	String[] subjectArr = new String[3];
	// 과목명
	
	Studentdata(String[] strArr) throws IOException
	{
		for(int i=1; i<=strArr.length; i++)
		{
			this.subjectArr[i-1] = strArr[i-1];
		}			// 과목명 매개변수 받아서 배열에 저장
		
		Input();	// 입력 메소드 호출
	}
	
	void Input() throws IOException
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\n**이름을 입력하세요 : ");
		this.name = scan.next();
		
		System.out.printf("\n[1]%s\t[2]%s\t[3]%s\n",subjectArr[0],subjectArr[1],subjectArr[2]);

		String str = CheckElement("1", "2", "3");
		this.subject = subjectArr[Integer.parseInt(str)-1];
	}	// 말그대로 입력메소드
	
	void print()
	{
		System.out.println(subject + " : " + name);
	}	// 말그대로 출력메소드
}


class Check
{
	String CheckElement(String... element) throws IOException
	{
		BufferedReader BR_CheckElement = new BufferedReader(new InputStreamReader(System.in));
		String checkElement;
		loop : for(;;)
		{
			System.out.printf("골라요! >>> ");
			checkElement = BR_CheckElement.readLine();
			for(String s : element)
			{
				if(checkElement.equals(s))
				{
					break loop;
				}
			}
			System.out.println("유효한 데이터가 아닙니다.");
		}
		return checkElement;
	}
} 
// 입력값 중 유효값 리턴 메서드. 무조건 유효값만. 유효값만 입력. 유효값 중에 입력값이 있을 때까지 계속. 
//계속 입력. 입력하고 유효값 중에 있으면 그거 리턴. 가변파라미터가 유효값 후보.