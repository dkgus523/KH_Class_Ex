import java.util.Scanner;

class Sample{
	Scanner scan = new Scanner(System.in);
	public String sinMinA;
	
	public Sample(){
		sinMinA = "hanna";
	}
	public void input() {
		System.out.print("�л� �̸��� �Է����ּ���.>>" ); 
		sinMinA = scan.next();
	}
	public void output() {
		System.out.println("�л� �̸� : " + sinMinA);
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
		 * //���� ���� 
		 * String sinMinA= "hanna";
		 * 
		 * //�л� �̸� �Է� 
		 * System.out.print("�л� �̸��� �Է����ּ���.>>"); 
		 * sinMinA = scan.next();
		 * 
		 * //�л� ���� ��� 
		 * System.out.println("�л� �̸� :" + sinMinA);
		 */
	}

}
