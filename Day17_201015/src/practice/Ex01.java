package practice;

class Bicycle {
	int id;
	String brand;
	
	public Bicycle(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}
}
public class Ex01 extends Bicycle{
	int wheelSize;
	
	public void prtInfo() {
		System.out.println("id : " + this.id);
		System.out.println("brand : " + this.brand);
		System.out.println("wheelSize : " + this.wheelSize);
	}
	public Ex01(int id, String brand) {
		super(id,brand);
	}
	public static void main(String[] args) {
		Ex01 mv = new Ex01(20051889,"hanna");
		mv.wheelSize = 20; //멤버변수 값 설정
		mv.prtInfo();
	
	}
}
	
