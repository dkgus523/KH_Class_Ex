package test06.generics07;
interface Eatable { //인터페이스
	public String eat();
}
class Apple implements Eatable { //인터페이스를 구현한 Apple
	public String toString() {
		return "I am an apple";
	}
		public String eat() {
			return "It tastes so good!";
		}
	}

class Box<T extends Eatable> { //Eatable를 상속받은 T
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		System.out.println(ob.eat());
		return ob;
	}
}
public class BoundedInterfaceBox {

	public static void main(String[] args) {
		Box<Apple> box = new Box<>();
		box.set(new Apple());

		Apple ap = box.get();
		System.out.println(ap);
	}

}
