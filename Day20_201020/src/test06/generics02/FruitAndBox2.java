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
//toString object라는 클래스 안에 있고 object는 모든 클래스의 부모클래스

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
		// 과일담는 박스 생성
		Box aBox = new Box();
		Box oBox = new Box();
				
		//과일을 박스에 담는다.
		aBox.set(new Apple());
		oBox.set(new Orange());
				
		//박스에서 과일을 꺼낸다.
		Apple ap = (Apple) aBox.get();  //형변환을 해줌
		Orange og = (Orange) oBox.get();
				
		System.out.println(ap);
		System.out.println(og);
	}

}
