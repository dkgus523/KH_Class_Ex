import java.util.Scanner;
class student {
	static void stu_grade(String grade) {
		System.out.println(grade);
	}
	
	static void stu_grade_other(String grade) { 
		System.out.println(grade);
	}	
}
public class Ex11 {

	public static void main(String[] args) {
		String grade = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생의 점수를 입력하세요.");
		int score = scan.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			grade="A+";
			break;
		case 8:
			grade="B+";
			break;
		case 7:
			grade="C+";
			break;
		case 6:
			grade="F";
			break;
		}
		student.stu_grade(grade);
		
		if(90<=score)
			grade = "A+";
		else if(80<=score)
			grade = "B+";
		else if(70<=score)
			grade = "C+";
		else
			grade = "F";
		student.stu_grade_other(grade);		
	}

}
