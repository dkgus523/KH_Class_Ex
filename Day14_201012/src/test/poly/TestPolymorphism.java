package test.poly;
import poly.sample.*;
public class TestPolymorphism {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
		c.out();
		System.out.println();
		Parent p = new Child();
		p.display(); //Overriding �� parent ����̹Ƿ� ���� ����
		//p.out(); //�����Ͽ���. Parent Ÿ������ Child ����� ������ �� ����.
	}
}