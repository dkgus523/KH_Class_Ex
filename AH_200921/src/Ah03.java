
public class Ah03 {

	public static void main(String[] args) {

		int a=3, b=3, c=3;
		// 대입 연산자 사례
		a += 3; //a = a+3 = 6
		b *= 3; //b = b*3 = 9
		c %= 2; //c = c%2 = 1
		System.out.println("a=" + a + ", b=" + b + ", c=" + c );
		
		int d=3;
		//증감 연산자 사례
		//++/--가 앞에 있으면 전위연산자, 뒤에 있으면 후위연산자
		//전위연산자는 결과를 출력하기 전에 연산하는 것, 후위연산자는 결과를 출력할 때 연산해주는 것
		a = d++; 
		System.out.println("a=" + a + ", d=" + d);
		a = ++d;
		System.out.println("a=" + a + ", d=" + d);
		a = d--;
		System.out.println("a=" + a + ", d=" + d);
		a = --d;
		System.out.println("a=" + a + ", d=" + d);
	}

}
