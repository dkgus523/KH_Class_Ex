import java.util.ArrayList;
import java.util.Scanner;
class StudentInfo{
	String uni_subject;
	String uni_name;
	int uni_grade = 0;
	
	String stu_subject;
	String stu_name;
	int stu_grade = 0;
	
	public StudentInfo(String uni_subject, String uni_name, int uni_grade,
			String stu_subject, String stu_name, int stu_grade){
		this.uni_subject = uni_subject;
		this.uni_name = uni_name;
		this.uni_grade = uni_grade;
		this.stu_subject = stu_subject;
		this.stu_name = stu_name;
		this.stu_grade = stu_grade;
	}

	public String getUni_subject() {
		return uni_subject;
	}

	public void setUni_subject(String uni_subject) {
		this.uni_subject = uni_subject;
	}

	public String getUni_name() {
		return uni_name;
	}

	public void setUni_name(String uni_name) {
		this.uni_name = uni_name;
	}

	public int getUni_grade() {
		return uni_grade;
	}

	public void setUni_grade(int uni_grade) {
		this.uni_grade = uni_grade;
	}

	public String getStu_subject() {
		return stu_subject;
	}

	public void setStu_subject(String stu_subject) {
		this.stu_subject = stu_subject;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public int getStu_grade() {
		return stu_grade;
	}

	public void setStu_grade(int stu_grade) {
		this.stu_grade = stu_grade;
	}
	
	
}
public class StudentInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uni_subject;
		String uni_name;
		int uni_grade = 0;
		
		String stu_subject;
		String stu_name;
		int stu_grade = 0;
		
		
		ArrayList<StudentInfo> stu = new ArrayList<StudentInfo>();

		//boolean run;
		while(true) {
			
			System.out.println("�޴��� �����ϼ���. 1.�л� ���� �Է�|2.�л� ���� ���|3.�̸����� �˻�|4.����");
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("�л� �а��� �Է��ϼ���.");
			case 2:
				
			case 3:
				
			case 4:
				
			}
		}
		
	}

}
