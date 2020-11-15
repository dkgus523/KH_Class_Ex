package test06.generics02;

class Apple {
	public String toString() { 
		return "I am an apple";
	}
}
class Orange {
	public String toString() {
		return "I am an orange";
	}
}
//toString object��� Ŭ���� �ȿ� �ְ� object�� ��� Ŭ������ �θ�Ŭ����

class Box {
	private Object ob;
	
	public void set(Object o) {
		ob = o;
	}
	public Object get() {
		return ob;
	}
}
public class FruitAndBox2 {

	public static void main(String[] args) {
		// ���ϴ�� �ڽ� ����
		Box aBox = new Box();
		Box oBox = new Box();
				
		//������ �ڽ��� ��´�.
		aBox.set(new Apple());
		oBox.set(new Orange());
				
		//�ڽ����� ������ ������.
		Apple ap = (Apple) aBox.get();  //����ȯ�� ����
		Orange og = (Orange) oBox.get();
				
		System.out.println(ap);
		System.out.println(og);
	}

}
