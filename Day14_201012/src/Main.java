class A {
	int a; //琶球
	public A() { //持失切
		System.out.println("a 持失切");
	}
	void aShow() { //五社球
		System.out.println("aShow()");
	}
}
class B extends A{
	int b;
	public B() {
		System.out.println("b 持失切");
	}
	void bShow() {
		System.out.println("bShow()");
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		A a = new A();
		b.aShow();
		b.a =10;
		a.a = 20;
	}

}
