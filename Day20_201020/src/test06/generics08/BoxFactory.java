package test06.generics08;
class Box<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
public class BoxFactory {
	//static ���׸� �޼ҵ�
	public static <T> Box<T> makeBox(T o){  //void ��� <T> Box<T>
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
	public static void main(String[] args) {
		 Box<String> sBox = BoxFactory.makeBox("sweet");
		 System.out.println(sBox.get());
		 
		 Box<Double> dBox = BoxFactory.makeBox(7.59);
		 System.out.println(dBox.get());

	}

}
