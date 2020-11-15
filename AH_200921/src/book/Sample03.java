package book;
class Test{
	String name = "강아지";
	
	public Test() {
		String name ="고양이";
		System.out.println("Test() 실행" + this.name);
		print();
	}
	void print(){
		String name ="사막여우";
		System.out.println("print() 실행" + name);
	}
}
public class Sample03 {

	public static void main(String[] args) {
		
		print();
	}
	public static void print(){
		String name ="토끼";
		System.out.println(name);
	
	}

}
