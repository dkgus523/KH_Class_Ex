package book;
class Test{
	String name = "������";
	
	public Test() {
		String name ="�����";
		System.out.println("Test() ����" + this.name);
		print();
	}
	void print(){
		String name ="�縷����";
		System.out.println("print() ����" + name);
	}
}
public class Sample03 {

	public static void main(String[] args) {
		
		print();
	}
	public static void print(){
		String name ="�䳢";
		System.out.println(name);
	
	}

}
