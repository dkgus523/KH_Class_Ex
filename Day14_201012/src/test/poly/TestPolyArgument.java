package test.poly;
public class TestPolyArgument {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy (new Chair( ));
		b.buy (new Desk( ));
	}
}
class Furniture {
	private int price; //��ǰ����
	public Furniture (int price) {
		this.price = price;
	}
}
class Chair extends Furniture {
	public Chair() {
		super(100); // �θ� Ŭ������ ������ ȣ��
	}
	@Override
	public String toString(){
		return "Chair";
	}
}
class Desk extends Furniture {
	public Desk() {
		super(200);
	}
	@Override
	public String toString() {
		return "Desk";
	}
}

class Buyer {
	private int money = 500;
	public void buy(Furniture f){
		if (money<f.price) {
			System.out.println("�ܾ׺���!");
			return;
		}
		money -= f.price;
		System.out.println(f+" ���ż���! �ܾ�: "+money+" ����");
	}
}