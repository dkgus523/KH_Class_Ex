class Data {
	int b, k;
	public Data() {
		System.out.println("Data 객체 생성완료");
	}
}
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.b =1;
		d.k =2;
		System.out.println(d.b + ", " + d.k);

	}

}
