package inherit.test;

import access.sample.*;

public class TestProtected {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
	//	parent.num = 10; // protected ����� �ٸ� ��Ű���� Ŭ���� �ۿ����� ���� �Ұ�
		child.insert();
		child.out();
	}
}
