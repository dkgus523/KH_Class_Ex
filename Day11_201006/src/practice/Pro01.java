package practice;
class Student{
	String name = "이한나";
	int rollno = 1234;
	int age = 22;
	
	void stu() {
		System.out.println("이름은 : " + name);
		System.out.println("학번은 : " + rollno);
		System.out.println("나이는 : " + age);
	}
}
public class Pro01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.stu();
	}

}
