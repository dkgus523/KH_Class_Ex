package oop.method.sample;
public class OverloadingSample {
	public void out ( ) {
		System.out.println ("out ( ) �޼ҵ� ����!");
	}
	public void out (int ... a) {
		System.out.println ("��������");
	}
	public void out (int num) { // �޼ҵ� �̸��� ���� �Ű������� �ٸ���. �����ε� ����!
		System.out.println ("out (" + num + ") �޼ҵ� ����!");
	}
}
