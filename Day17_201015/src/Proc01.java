import java.util.Scanner;

class Sample{
	Scanner scan = new Scanner(System.in);
	public String sinMinA;
	
	public Sample(){
		sinMinA = "hanna";
	}
	public void input() {
		System.out.print("학생 이름을 입력해주세요.>>" ); 
		sinMinA = scan.next();
	}
	public void output() {
		System.out.println("학생 이름 : " + sinMinA);
	}
}
public class Proc01 {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.input();
		s.output();
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * //변수 지정 
		 * String sinMinA= "hanna";
		 * 
		 * //학생 이름 입력 
		 * System.out.print("학생 이름을 입력해주세요.>>"); 
		 * sinMinA = scan.next();
		 * 
		 * //학생 정보 출력 
		 * System.out.println("학생 이름 :" + sinMinA);
		 */
	}

}
