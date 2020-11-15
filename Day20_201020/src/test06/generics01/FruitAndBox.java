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
	private Apple ap; //참조 변수 선언 , 멤버 필드

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) { //new 없다는게 중요하다.
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
		// 과일담는 박스 생성
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		//과일을 박스에 담는다.
		aBox.setAp(new Apple());
		oBox.setOg(new Orange());
		
		//박스에서 과일을 꺼낸다.
		Apple ap = aBox.getAp();
		Orange og = oBox.getOg();
		
		System.out.println(ap);
		System.out.println(og);
	}

}
