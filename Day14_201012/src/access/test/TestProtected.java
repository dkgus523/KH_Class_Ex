package access.test;

import access.sample.Child;
import access.sample.Parent;

public class TestProtected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent();
		Child child = new Child();
		
		parent.num = 10; // protected ����� �ٸ� ��Ű���� Ŭ���� �ۿ����� ���� �Ұ�
		child.insert();
		child.out();
	}

}
