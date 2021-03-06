package test06.generics03;


class Apple {
	public String toString() {
		return "I am an apple.";
	}
}
class Orange {
	public String toString() {
		return "I am an orange";
	}
}
class Box<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
public class FruitAndBox2_Generic {

	public static void main(String[] args) {
		// 과일담는 박스 생성
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
						
		//과일을 박스에 담는다.
		aBox.set(new Apple());
		oBox.set(new Orange());
						
		//박스에서 과일을 꺼낸다.
		Apple ap = aBox.get();
		Orange og = oBox.get();
						
		System.out.println(ap);
		System.out.println(og);
	}

}
