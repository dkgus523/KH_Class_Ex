package poly.sample;
public class Child extends Parent {
	private int x=100;
	public Child ( ) { }
	public void out() {
		System.out.println("�θ��� protected num �ʵ� : " + num);
		System.out.println("�ڽ� Ŭ���� �޼ҵ�");
	}
	@Override
	public void display() {
		System.out.println("��ӹ޾� �������� �޼ҵ�");
	}
}