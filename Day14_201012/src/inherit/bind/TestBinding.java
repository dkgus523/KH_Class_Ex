package inherit.bind;

import inherit.sample.Child;
import inherit.sample.Parent;

public class TestBinding {
	public static void main(String[] args) {
		Parent p = new Child();
		p.display( ); // �����Ͻÿ��� ���� ���ε�, ����ÿ��� ���� ���ε���
	}
}