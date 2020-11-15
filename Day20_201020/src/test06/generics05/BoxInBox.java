package test06.generics05;
class Box<T>{
	private T ob; //¸â¹öÇÊµå

	public T get() {
		return ob;
	}

	public void set(T ob) {
		this.ob = ob;
	}
	
}
public class BoxInBox {

	public static void main(String[] args) {
		Box<String> aBox = new Box<>();
		aBox.set("I am so happy.");
		
		Box<Box<String>> bBox = new Box<>();
		bBox.set(aBox);
		
		Box<Box<Box<String>>> cBox = new Box<>();
		cBox.set(bBox);
		
		System.out.println(cBox.get().get().get());

	}

}
