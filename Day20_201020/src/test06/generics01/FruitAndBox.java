package test06.generics01;
class Apple {
	public String toString() {
		return "apple";
	}
}
class Orange {
	public String toString() {
		return "Orange";
	}
}
class AppleBox {
	private Apple ap; //���� ���� ���� , ��� �ʵ�

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) { //new ���ٴ°� �߿��ϴ�.
		this.ap = ap;
	}
	
}
class OrangeBox {
	private Orange og;

	public Orange getOg() {
		return og;
	}

	public void setOg(Orange og) {
		this.og = og;
	}
	
	
}
public class FruitAndBox {

	public static void main(String[] args) {
		// ���ϴ�� �ڽ� ����
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		//������ �ڽ��� ��´�.
		aBox.setAp(new Apple());
		oBox.setOg(new Orange());
		
		//�ڽ����� ������ ������.
		Apple ap = aBox.getAp();
		Orange og = oBox.getOg();
		
		System.out.println(ap);
		System.out.println(og);
	}

}
