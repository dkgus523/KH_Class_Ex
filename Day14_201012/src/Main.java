class A {
	int a; //�ʵ�
	public A() { //������
		System.out.println("a ������");
	}
	void aShow() { //�޼ҵ�
		System.out.println("aShow()");
	}
}
class B extends A{
	int b;
	public B() {
		System.out.println("b ������");
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
