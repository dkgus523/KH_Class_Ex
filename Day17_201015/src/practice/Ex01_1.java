package practice;

class Cycle {
	int id;
	int wheelSize;
	String brand;
	
	public Cycle(int id, String brand, int wheelSize ) {
		this.id = id;
		this.wheelSize = wheelSize;
		this.brand = brand;
	}
}
public class Ex01_1 extends Cycle{
	
	public void prtInfo() {
		System.out.println("id : " + this.id);
		System.out.println("brand : " + this.brand);
		System.out.println("wheelSize : " + this.wheelSize);	
	}
	public Ex01_1(int id, String brand, int wheelSize) {
		super(id,brand,wheelSize);
	}
	public static void main(String[] args) {
		Ex01_1 mv = new Ex01_1(20051889,"hanna",20);
		//mv.brand ="hanna"; //멤버변수 값 설정
		mv.prtInfo();
	
	}
}
	
