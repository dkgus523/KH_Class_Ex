import java.util.Scanner;

class Ex{
	Scanner scan = new Scanner(System.in);
	void name_func() {
		System.out.print("이름은? ");
		String name = scan.next();
		System.out.println("이름 : "+name);
	}
	void max() {
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(num1 > num2)
			System.out.println("최대값은 ?" + num1);
		else
			System.out.println("최대값은 ?" + num2);		
	}
	void gugu() {
		int number = scan.nextInt();
		for(int nb=1; nb<10; nb++) {
				System.out.println(number + "*" + nb + "=" + number*nb);
		}
	}
	void run() {
		name_func();
		max();
		gugu();
	}
}
	

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex e = new Ex();
		e.run();
	}

}
