package Project02;
//11. 프로젝트 10번을 기준으로 만드시오.
//프로젝트 10번을 Grade 클래스로 생성한 후 실행하세요.
//생성 클래스 : Grade, Main

public class Main {
	public static void main(String[] args) {

		Grade grade = new Grade();
		grade.input();     //한번 반복
		grade.input();
		grade.input();
		System.out.println("프로그램이 종료되었습니다.");
	}
}
